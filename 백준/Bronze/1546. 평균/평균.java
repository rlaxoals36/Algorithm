import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        float[] arr = new float[t];
        float max = 0;
        float result = 0;
        
        for(int i = 0; i < t; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        
        for(int i = 0; i < t; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        
        for(int i = 0; i < t; i++) {
            result += (arr[i]/max*100)/t;
        }
        System.out.print(result);
    }
}