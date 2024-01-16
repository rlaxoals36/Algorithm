import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int firstindex = -1;
        int lastindex = -1;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                firstindex = i;
                break;
            }
        }
        if(firstindex != -1) {
            for(int i = firstindex; i < arr.length; i++){
                if(arr[i]==2) lastindex = i;           
            }
        }
        
        List<Integer> list = new ArrayList<>();
        if(firstindex == -1) list.add(-1);
        else if(firstindex == lastindex) list.add(2);
        else {
            for(int i = firstindex; i <= lastindex; i++){
                list.add(arr[i]);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}