import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        int a = 0;
        int b = 0;
        
        for(int i = 0; i < t; i++) {
            a = in.nextInt();
            b = in.nextInt();
            System.out.println(a+b);
        }
        in.close();
    }
}