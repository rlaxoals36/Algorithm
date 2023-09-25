import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char ch;
        String output = "";
        
        for(int i = 0; i<a.length(); i++) {
            ch = a.charAt(i);
            if(ch>=65 && ch <=90){
                output += a.valueOf(ch).toLowerCase() ;
            } else if (ch >= 97 && ch <=122) {
                output += a.valueOf(ch).toUpperCase();
            } else
                output += ch;
        }
        System.out.println(output);
    }
}