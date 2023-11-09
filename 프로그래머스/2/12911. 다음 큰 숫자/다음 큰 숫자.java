class Solution {
    public int solution(int n) {
        int answer = n + 1;
        String nbinary = Integer.toBinaryString(n);
        while(true) {
            int nCnt = 0;
            int aCnt = 0;
            String abinary = Integer.toBinaryString(answer);
            
            for(int i = 0; i < nbinary.length(); i++){
                if(nbinary.charAt(i)=='1') nCnt++;
            }
            
            for(int i = 0; i < abinary.length(); i++){
                if(abinary.charAt(i)=='1') aCnt++;
            }
            
            if(nCnt==aCnt) break;
            answer++;
            
        }
        return answer;
    }
}