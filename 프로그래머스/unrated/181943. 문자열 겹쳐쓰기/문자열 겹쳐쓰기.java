class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        answer = my_string.substring(0,s);
        answer += overwrite_string;
        String a = my_string.substring(s+overwrite_string.length());
        answer += a;
        
        return answer;
    }
}