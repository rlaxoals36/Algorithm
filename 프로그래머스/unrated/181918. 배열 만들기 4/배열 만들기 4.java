import java.util.*;
class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(stk.size()==0) stk.add(arr[i]);
            else if(arr[i]>stk.get(stk.size()-1))
                stk.add(arr[i]);
            else if(arr[i]<=stk.get(stk.size()-1)){
                stk.remove(stk.size()-1);
                i--;
            }
        }
        return stk;
    }
}