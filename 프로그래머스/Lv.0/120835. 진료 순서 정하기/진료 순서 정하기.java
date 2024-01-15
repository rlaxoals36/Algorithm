import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] arr = emergency.clone();
        Arrays.sort(arr);
        int count = 1;
        for(int i = arr.length-1; i >= 0; i--){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == emergency[j]) {
                    answer[j] = count;
                    count++;
                }
            }
        }
        return answer;
    }
}