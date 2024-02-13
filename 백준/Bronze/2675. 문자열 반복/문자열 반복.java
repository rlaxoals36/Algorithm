import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        int n = 0;
        String str = "";
        
        for(int i =0; i < t; i++) {
            n = in.nextInt();
            str = in.next();
            
            for(int j = 0; j < str.length(); j++) {
                for(int k = 0; k < n; k++) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
        in.close();
    }
}