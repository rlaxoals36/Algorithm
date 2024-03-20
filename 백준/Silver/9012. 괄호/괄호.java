import java.util.*;

public class Main {
    
    public static void foo(String s) {
        Stack<Character> stack = new Stack<>();
        
        int i = 0;
        while(i < s.length()) {
            char c = s.charAt(i);
            
            if(c == '(') {
                stack.push(c);
            } else {  // ')'
                if(stack.size() == 0) {  // 스택에 사이즈가 비어있는데 pop을 하려면 잘못된 가로 열쌍이기때문에
                    System.out.println("NO");
                    return;
                }
                stack.pop();
            }
            
            i++;
        }
        
        if(stack.size() > 0) {  // 문자열을 다 돌았는데 스택에 남아있으면
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        for(int i = 0; i < T; i++) {
            foo(in.next());
        }
    }
}