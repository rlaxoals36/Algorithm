import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n = in.nextInt();
        
        for(int i = 0; i < t; i++) {
            int a = in.nextInt();
            if(n > a) { 
                System.out.print(a+" ");
            }
        }
        in.close();
    }
}