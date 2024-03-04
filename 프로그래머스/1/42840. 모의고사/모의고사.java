import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] num1 = {1,2,3,4,5};    // 5개씩 반복
        int[] num2 = {2,1,2,3,2,4,2,5};  // 8개씩 반복
        int[] num3 = {3,3,1,1,2,2,4,4,5,5}; // 10개씩 반복
        int[] score = {0,0,0};
        
        for(int i = 0; i < answers.length; i++) {
            if(num1[i % 5] == answers[i]) score[0]++;
            if(num2[i % 8] == answers[i]) score[1]++;
            if(num3[i % 10] == answers[i]) score[2]++;            
        }
        
        int max = Math.max(score[0], Math.max(score[1], score[2]));
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < score.length; i++) {
            if(score[i] == max) list.add(i + 1);
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}