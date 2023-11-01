import java.util.*;
class Solution {
    public String solution(String s, int n) {
        char[] ch = s.toCharArray();
        for(int i = 0; i < ch.length; i++){
            if( ch[i] == ' ') { ch[i] = ' ';}
            else if(Character.isUpperCase(ch[i])) {
                if((char) (ch[i]+n) <= 'Z')
                    ch[i] = (char) (ch[i]+n);
                else
                    ch[i] = (char) ('A' +ch[i]+n -'Z'-1);
            } else{
                if((char) (ch[i]+n) <= 'z')
                    ch[i] = (char) (ch[i]+n);
                else
                    ch[i] = (char) ('a' +ch[i]+n -'z'-1);
                }
            }
        return String.valueOf(ch);
    }
}