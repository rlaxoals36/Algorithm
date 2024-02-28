import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        in.close();
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 1; i <= n; i++) {
            q.offer(i);
        }
        
        while(q.size() > 1) {
            q.poll();
            int num = q.poll();
            q.offer(num);
        }
        System.out.print(q.poll());
    }
}