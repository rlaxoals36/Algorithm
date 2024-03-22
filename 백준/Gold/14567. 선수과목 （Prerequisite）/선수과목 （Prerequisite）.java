import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        String s = in.nextLine();
        int N = Integer.valueOf(s.split(" ")[0]);  // 전체 과목 수
        int M = Integer.valueOf(s.split(" ")[1]);  // 선수 과목 조건의 수
        
        // index -> 과목번호 (0, 과목번호 1)
        // value -> 선수 과목의 수
        int[] indegree = new int[N];
        
        // < from, List<to>>
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int i = 0; i < M; i++) {
            s = in.nextLine();
            // A 과목은 B 과목의 선수과목
            int A = Integer.valueOf(s.split(" ")[0]);  // from
            int B = Integer.valueOf(s.split(" ")[1]);  // to
            
            indegree[B - 1] += 1;
            List<Integer> list = graph.getOrDefault(A, new ArrayList<>());
            list.add(B);
            graph.put(A, list);
        }
        
        Queue<Pair> queue = new LinkedList<>();
        for(int i = 1; i <= indegree.length; i++) {   // 과목의 수는 1부터 시작
            if(indegree[i - 1] == 0) {
                queue.add(new Pair(i, 1));  // 1학기
            }
        }
        
        Integer[] result = new Integer[N];
        while(!queue.isEmpty()) {
            Pair p = queue.poll();
            result[p.subject - 1] = p.semester;
            
            if(graph.containsKey(p.subject)) {
                for(Integer node : graph.get(p.subject)) {
                    indegree[node - 1] -= 1;
                    if(indegree[node - 1] == 0) {
                        queue.add(new Pair(node, p.semester + 1));
                    }
                }
            }
        }
        
        for(Integer i : result) {
            System.out.print(i + " ");
        }
    }
    
    static class Pair {
        final Integer subject;  // 과목 번호
        final Integer semester;  // 학기
            
        public Pair(Integer subject, Integer semester) {
            this.subject = subject;
            this.semester = semester;
        }
    }
    
}