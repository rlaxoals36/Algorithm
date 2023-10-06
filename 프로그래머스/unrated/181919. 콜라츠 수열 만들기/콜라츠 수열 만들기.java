import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> a = new ArrayList<>();
        a.add(n);
        while(n!=1){
            if(n%2==0){
                n = n/2;
            } else {
                n = n*3+1;
            }
            a.add(n);
        }
        int[] answer = new int[a.size()];
        for(int i = 0; i < a.size(); i++){
            answer[i] = a.get(i);
        }
        return answer;
    }
}