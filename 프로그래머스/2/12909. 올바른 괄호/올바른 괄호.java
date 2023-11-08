class Solution {
    boolean solution(String s) {
        boolean answer = true;

        char[] ch = s.toCharArray();
        int count = 0;
        for(char c: ch){
            if (c=='(') count ++;
            else count --;
            
            if(count < 0) return false;
        }
        if(count != 0) return false;

        return answer;
    }
}