import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        char[] ch = str.toCharArray();
        for(char c:ch){
            answer += c - '0';
        }
        
        
        return answer;
    }
}