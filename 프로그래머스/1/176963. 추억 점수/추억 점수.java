import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        HashMap<String,Integer> map = new LinkedHashMap<>();
        
        for(int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);   // 추억하는 사람 이름에 점수 저장
        }
        
        for(int i = 0; i < photo.length; i++) {
            int sum = 0;
            
            for(int j = 0; j < photo[i].length; j++) {
                if(map.containsKey(photo[i][j])) {  // map의 key에 photo 속 사람이 있다면
                    sum += map.get(photo[i][j]);    // 점수 추가
                }
            }
            answer[i] = sum;
        }
        return answer;
    }
}