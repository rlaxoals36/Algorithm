import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        Set<Integer> A = new HashSet<>();
        for(int i = 0; i < N; i++) {
            int n = in.nextInt();
            A.add(n);
        }
        
        StringBuilder sb = new StringBuilder();
        
        int M = in.nextInt();
        for(int i = 0; i < M; i++) {
            int m = in.nextInt();
            
            if(A.contains(m)) {
                sb.append(1 + "\n");
            } else {
                sb.append(0 + "\n");
            }
        }
        System.out.print(sb);
    }
        
}