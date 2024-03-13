import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String,Integer> playerMap = new HashMap<>();
        for(String str : participant) {
            // 동명이인이 없는 경우 디폴드 값 + 1;
            // 동명이인이 있는 경우 저장된 값 + 1;
            playerMap.put(str, playerMap.getOrDefault(str, 0)+1);
        }
        
        for(String str : completion) {
            // 완료된 선수가 있는 경우 저장된 값에서 -1
            playerMap.put(str, playerMap.get(str)-1);
        }
        
        for(String str : participant) {
            
            if(playerMap.get(str) == 1) answer = str;
        }
        return answer;
    }
}