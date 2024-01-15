import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] ch1 = before.toCharArray();
        char[] ch2 = after.toCharArray();
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        String str1 = new String(ch1);
        String str2 = new String(ch2);
        if(str1.equals(str2)) answer = 1;
        return answer;
    }
}