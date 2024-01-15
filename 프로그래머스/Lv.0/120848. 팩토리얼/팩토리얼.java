class Solution {
    public int solution(int n) {
        int answer = 1;
        int count = 0;
        while(true) {
            if(answer > n) {
                break;
            } else {
                count++;
                answer *= count;
            }
        }
        return count-1;
    }
}