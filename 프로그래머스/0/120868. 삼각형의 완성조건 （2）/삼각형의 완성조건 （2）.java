
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0],sides[1]);
        int min = Math.min(sides[0],sides[1]);
        for(int i = max+1; i < sides[0]+sides[1]; i++) {
            answer++;
        }
        for(int j = 1; j <= max; j++) {
            if(max < min + j) answer++;
        }
        return answer;
    }
}