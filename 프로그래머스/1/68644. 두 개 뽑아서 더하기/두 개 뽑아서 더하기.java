import java.util.*;
class Solution {
    public Integer[] solution(int[] numbers) {
        Set<Integer> set = new TreeSet<>();
        
        for(int i = 0; i < numbers.length-1; i++){
            for (int j = i+1; j < numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }
        Integer[] answer = set.toArray(new Integer[0]);
        return answer;
    }
}