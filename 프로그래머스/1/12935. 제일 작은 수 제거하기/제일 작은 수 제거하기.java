import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        
        int[] answer = new int[arr.length-1];
        int min = Arrays.stream(arr).min().getAsInt();
        List<Integer> list = new ArrayList<>();

        if(arr.length==1)
            answer = new int[]{-1};
        else {
            for (int ar : arr)
                list.add(ar);
                list.remove(Integer.valueOf(min));
            for (int i = 0; i < list.size(); i++)
                answer[i] = list.get(i);
        }
        return answer;
    }
}