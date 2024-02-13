import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 1;
        for(int i = 0; i < 3; i++) {
            n *= in.nextInt();
        }
        in.close();
        
        String str = String.valueOf(n);
        String[] arr = str.split("");
        int zero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("0")) zero++;
            else if(arr[i].equals("1")) one++;
            else if(arr[i].equals("2")) two++;
            else if(arr[i].equals("3")) three++;
            else if(arr[i].equals("4")) four++;
            else if(arr[i].equals("5")) five++;
            else if(arr[i].equals("6")) six++;
            else if(arr[i].equals("7")) seven++;
            else if(arr[i].equals("8")) eight++;
            else if(arr[i].equals("9")) nine++;
        }
        System.out.println(zero);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        System.out.println(seven);
        System.out.println(eight);
        System.out.println(nine);
    }
}