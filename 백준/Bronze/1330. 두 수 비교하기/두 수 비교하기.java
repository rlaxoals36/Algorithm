import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        
        String str = "";
        
        if(a>b) str = ">";
        else if(a<b) str = "<";
        else if(a==b) str = "==";
        System.out.println(str);
        in.close();
    }
}