class Solution {
    public String solution(String my_string) {
        String[] arr = my_string.split("");
        String answer = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(!answer.contains(arr[i])) answer+= arr[i];
            
        }
        return answer;
    }
}