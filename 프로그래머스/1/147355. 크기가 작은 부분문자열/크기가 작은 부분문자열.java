class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        Long pNum = Long.parseLong(p);
        for(int i = 0 ; i < t.length()-p.length()+1; i++){
            String tmp = t.substring(i,i+p.length());
            if(Long.parseLong(tmp) <= pNum)
                answer++;
        }
        return answer;
    }
}