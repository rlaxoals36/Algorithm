class Solution {
    public int solution(int a, int b) {
        
        String s1 = String.valueOf(a)+String.valueOf(b);
        int s2 = 2*a*b;
        if(Integer.valueOf(s1)>=s2)
            return Integer.valueOf(s1);
            
        return s2;
    }
}