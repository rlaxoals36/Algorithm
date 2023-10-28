class Solution {
    public String solution(String s) {
        String answer = "";
        if (s.length() == 1 || s.length() == 2) answer = s;
        else if(s.length() % 2 == 0){
            answer = String.valueOf(s.charAt(s.length()/2-1)) +String.valueOf(s.charAt(s.length()/2));
        } else
            answer = String.valueOf(s.charAt(s.length()/2));
        return answer;
    }
}