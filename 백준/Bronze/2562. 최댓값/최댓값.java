import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int[] arr = new int[9];
        int max = 0;
        int count = 0;
        
        for(int i = 0; i < 9; i++) {
            arr[i] = in.nextInt();
            
            if(arr[i] > max) {
                max = arr[i];
                count = i + 1;
            }
        }
        in.close();
        System.out.println(max);
        System.out.println(count);
    }
}