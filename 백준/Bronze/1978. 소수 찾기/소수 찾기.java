import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        int count = 0;
        
        for(int i = 0; i < t; i++) {
            int n = in.nextInt();
            int nCnt = 0;
            if(n > 1) {
                for(int j = 2; j <= n; j++) {
                    if(n % j == 0) nCnt++;
                }
            }
            if(nCnt == 1) count++;
        }
        in.close();
        System.out.print(count);
    }
}