import java.util.*;

public class Main{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < 10; i++) {
            set.add(in.nextInt() % 42);
        }
        in.close();
        System.out.print(set.size());
    }
}