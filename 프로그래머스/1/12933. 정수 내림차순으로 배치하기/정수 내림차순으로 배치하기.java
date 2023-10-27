import java.util.Arrays;
class Solution {
    public long solution(long n) {
        String str = String.valueOf(n);
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        String s = "";
        for(int i = ch.length-1; i >= 0; i--){
            s += ch[i];
        }
        return Long.valueOf(s);
    }
}