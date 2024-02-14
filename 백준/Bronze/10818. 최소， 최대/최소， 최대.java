import java.util.*;

public class Main{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        int n = in.nextInt();
        int max = n;
        int min = n;
        
        for(int i = 0; i < t-1; i++) {
            n = in.nextInt();
            max = Math.max(max,n);
            min = Math.min(min,n);
        }
        System.out.println(min+" "+max);
    }
}