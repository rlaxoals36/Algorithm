class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] f = new int[n+1];
        // 0 1 2 3 4 5 6
        for(int i = 0; i < f.length; i++){
            if(i==0) f[i] = 0;
            else if(i==1) f[i] = 1;
            else {
                f[i] = (f[i-2] % 1234567) + (f[i-1] % 1234567) % 1234567;
            }
        }
        answer = f[f.length-1]%1234567;
        return answer;
    }
}