class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] str = my_string.split("");
        for(int i = str.length-1; i >= 0; i--) {
            answer += str[i];
        }
        return answer;
    }
}