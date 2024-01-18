class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if( a%2 == 0 && b%2 == 0) {
            if(a >= b) answer = a - b;
            else answer = b - a;
        }
        else if(a%2 != 0 && b%2 != 0) answer = a*a+b*b;
        else answer = (a+b) * 2;
        return answer;
    }
}