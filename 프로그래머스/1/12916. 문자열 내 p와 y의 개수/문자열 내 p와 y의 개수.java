class Solution {
    boolean solution(String s) {
        int p = 0;
        int y = 0;
        String str = s.toLowerCase();
        char[] ch = str.toCharArray();
        for(char c : ch){
            if(c=='p') p += 1;
            else if(c=='y') y += 1;
        }
        if(p==y) return true;
        return false;
    }
}