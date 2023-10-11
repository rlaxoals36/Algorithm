import java.util.*;
class Solution {
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < intStrs.length; i++){
            if(Integer.valueOf(intStrs[i].substring(s,s+l))>k)
                numbers.add(Integer.valueOf(intStrs[i].substring(s,s+l)));
        }
        return numbers;
    }
}