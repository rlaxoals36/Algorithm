import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        String str = in.next();
        int n = in.nextInt();
        in.close();
        char ch = str.charAt(n-1);
        System.out.print(ch);
    }
}