class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 1;
        while(true) {
            if(n == i*i) {
                answer = 1;
                break;
            }
            i++;
            if(n < i*i) {
                answer = 2;
                break;
            }
        }
        return answer;
    }
}