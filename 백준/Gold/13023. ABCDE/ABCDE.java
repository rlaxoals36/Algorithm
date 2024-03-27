import java.util.*;

public class Main {
    
    static boolean found = false;  // 5단계의 연결을 찾았는지 
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        
        int N = Integer.valueOf(s.split(" ")[0]);  // 사람의 수(버텍스 수)
        int M = Integer.valueOf(s.split(" ")[1]);  // 관계의 수(엣지 수)
        
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            graph.add(i, new ArrayList<>());
        }
        
        for(int i = 0; i < M; i++) {
            s = in.nextLine();
            
            int a = Integer.valueOf(s.split(" ")[0]);
            int b = Integer.valueOf(s.split(" ")[1]);
            
            graph.get(a).add(b);
            graph.get(b).add(a);  // 양방향 그래프 
        }
        
        boolean[] visited = new boolean[N];
        for(int i = 0; i < N; i++) {
            dfs(graph, visited, i, 1);
            
            if(found) {
                System.out.println("1");
                return;
            }
        }
        System.out.println("0");
    }
    
    static void dfs(List<List<Integer>> graph, boolean[] visited, int v, int depth) {
        if(depth == 5) {
            found = true;
            return;
        }
        
        visited[v] = true;
        
        for(int vertex : graph.get(v)) {
            if(!visited[vertex]) {
                dfs(graph, visited, vertex, depth + 1);
            }
            
            if(found) {
                return;
            }
        }
        
        visited[v] = false;  // 방문한 지점은 모두 false 처리
    }
}