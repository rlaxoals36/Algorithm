import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = "";
        if(n<=100 && n>=90) str = "A";
        else if(n<=89 && n >= 80) str = "B";
        else if(n<=79 && n >= 70) str = "C";
        else if(n<=69 && n >= 60) str = "D";
        else str = "F";
        in.close();
        System.out.print(str);
    }
}