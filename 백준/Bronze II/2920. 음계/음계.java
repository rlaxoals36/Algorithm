import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int[] arr = new int[8];
        String s = "";
        for(int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i]+1 == arr[i+1]) s = "ascending";
            else if(arr[i]-1 == arr[i+1]) s= "descending";
            else {
                s= "mixed";
                break;
            }
        }
        System.out.print(s);
    }
}