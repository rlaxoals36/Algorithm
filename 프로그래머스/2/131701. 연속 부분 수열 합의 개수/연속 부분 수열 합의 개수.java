import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;

        Set<Integer> set = new HashSet<Integer>();
        
        for(int i = 1; i <= elements.length; i++) {  // 부분수열의 길이
            for(int j = 0; j < elements.length; j++) { // 시작 인덱스
                int sum = 0;
                for(int k = j; k < j+i; k++) {
                    sum += elements[k % elements.length];
                }
                set.add(sum);
            }
        }
        answer = set.size();
        return answer;
    }
}