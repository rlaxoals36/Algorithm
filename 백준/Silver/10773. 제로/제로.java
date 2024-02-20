import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int t = in.nextInt();
        
        for(int i = 0; i < t; i++) {
            int n = in.nextInt();
            
            if(n == 0) {
                stack.pop();
            } else {
                stack.push(n);
            }
        }
        
        int sum = 0;
        for(int s : stack) {
            sum += s;
        }
        System.out.print(sum);
    }
}