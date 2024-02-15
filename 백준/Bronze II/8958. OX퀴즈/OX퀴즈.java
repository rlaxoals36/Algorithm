import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for(int i = 0; i < t; i++) {
            String str = in.next();
            int sum = 0;
            int n = 0;
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == 'O') {
                    n++;
                    sum += n;
                } else if(str.charAt(j) == 'X') {
                    n = 0;
                }
            }
            System.out.println(sum);
        }
        in.close();
    }
}