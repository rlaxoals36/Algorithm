class Solution {
    public long solution(int a, int b) {
        long sum = 0;
        if(a > b) for(long i = b; i <=a; i++) {sum += i;}
        else if(a < b) for(long i = a; i <=b; i++) {sum += i;}
        else if(a == b) sum = a;
        return sum;
    }
}