class Solution {
    public String solution(String my_string, int s, int e) {
        String str1 = my_string.substring(0,s);
        String str2 = "";
        String str3 = my_string.substring(e+1,my_string.length());
        for(int i = e; i>=s; i--){
            str2 += String.valueOf(my_string.charAt(i));
        }
        return str1+str2+str3;
    }
}