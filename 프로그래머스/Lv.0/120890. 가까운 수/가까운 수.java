import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = array[0];
        int sub = 0;
        int max = Math.max(array[0],n);
        int min = Math.min(array[0],n);
        sub = max - min;
        
        for(int i = 1; i < array.length; i++) {
            max = Math.max(array[i],n);
            min = Math.min(array[i],n);
            if(sub > max - min) {
                sub = max - min;
                answer = array[i];
            }
        }
        return answer;
    }
}