class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        char[] ch = str.toCharArray();
        int[] answer = new int[ch.length];
        for(int i = ch.length-1; i >= 0; i--){
            answer[ch.length-1-i] = Integer.valueOf(ch[i]-'0');
        }
        return answer;
    }
}