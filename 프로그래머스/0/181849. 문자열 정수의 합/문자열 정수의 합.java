class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] str = num_str.split("");
        for(int i = 0; i < num_str.length(); i++) {
            answer += Integer.valueOf(str[i]);
        }
        return answer;
    }
}