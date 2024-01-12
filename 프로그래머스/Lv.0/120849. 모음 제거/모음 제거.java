class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String[] v = {"a","e","i","o","u"};
        
        for(String v1:v) {
            answer = answer.replaceAll(v1,"");
        }
        
        return answer;
    }
}