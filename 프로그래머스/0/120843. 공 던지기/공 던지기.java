class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 1;
        for(int i = 0; i < k-1; i++) {
            answer += 2;
            if( answer > numbers.length) {
                if(answer-numbers.length == 2) {
                    answer = 2;
                } else if(answer-numbers.length == 1) {
                    answer = 1;
                }
            }
        }
        return answer;
    }
}