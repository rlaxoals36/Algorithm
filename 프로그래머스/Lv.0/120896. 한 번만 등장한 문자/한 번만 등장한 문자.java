import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        int count = 0;
        String[] str = s.split("");
        Arrays.sort(str);
        for(int i = 0; i < str.length; i++){
            count = 0;
            for(int j = 0; j < str.length; j++){
                if(str[i].contains(str[j])) count++;
            }
            if(count == 1) answer += str[i];
        }
        return answer;
    }
}