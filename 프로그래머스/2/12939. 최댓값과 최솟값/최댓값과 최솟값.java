import java.util.*;
class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        int[] num = new int[str.length];
        for(int i = 0; i < num.length; i++){
            num[i] = Integer.valueOf(str[i]);
        }
        Arrays.sort(num);
        String ss = 
            String.valueOf(num[0]) + " " + String.valueOf(num[num.length-1]);
        return ss;
    }
}