class Solution {
    public int solution(int n) {
        
        int answer = 1;   // 2는 무조건 소수이므로 초기값 1
  
        for(int i = 3; i <= n; i++) {
            if(isDecimal(i)) answer++;
        }
        return answer;
    }
    
    private boolean isDecimal(int n) {  // 소수 판별
        for(int i = 2; i <= (int) Math.sqrt(n); i++) {
            if(n % i == 0) {   // 나머지가 0이면 소수가 아니므로 바로 false를 return
                return false;
            }
        }
        return true;  // for문을 다 마치면 소수
    }
}