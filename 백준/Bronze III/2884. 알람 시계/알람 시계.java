import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int h = in.nextInt();
        int m = in.nextInt();
        in.close();
        
        if(m < 45) {
            h--;
            m = 60-(45-m);
            if(h < 0) {
                h = 23;
            }
            System.out.print(h+" "+m);
        } else {
            System.out.print(h+" "+(m-45));
        }
    }
}