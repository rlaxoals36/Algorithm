class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        for(int i = Math.min(n,m); i >=1; i--){
            if(n%i==0 && m%i ==0){
                answer[0] = i;
                break;
            }
        }
        int lcm = 0;
        int a = 2;
        int max = Math.max(n,m);
        int initialmax = max;
        while (lcm!=max) {
            if((max % n) == 0 && (max % m) == 0){
                lcm = max;
                answer[1] = lcm;
            }
            else {
                max =initialmax * a;
                a++;
            }
        }
        return answer;
    }
}