class Solution {
    public String solution(String phone_number) {
        String sr = phone_number.substring(phone_number.length()-4);
        char[] ch = phone_number.substring(0,phone_number.length()-4).toCharArray();
        for (int i = 0; i < ch.length; i++) {
            ch[i] = '*';
        }
        return String.valueOf(ch)+sr;
    }
}