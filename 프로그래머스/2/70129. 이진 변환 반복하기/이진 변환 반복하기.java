class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        while(s.length() > 1) {
            
            int count = 0;
   
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i)=='1') count++;
                else answer[1]++;
            }
            s = Integer.toBinaryString(count);
            answer[0]++;
        }
        return answer;
    }
}