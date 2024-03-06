import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();
        
        list.add(words[0]);  // 맨 첫단어는 무조건 들어감
            
        for(int i = 1; i < words.length; i++) {
            
            // 이전에 등장한 단어는 안됨, 앞사람이 말한 마지막 문자로 시작
            if(!list.contains(words[i]) && words[i-1].charAt(words[i-1].length()-1) 
                                                == words[i].charAt(0)) {
                list.add(words[i]);
            } else {
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                break;
            }
        }      

        return answer;
    }
}