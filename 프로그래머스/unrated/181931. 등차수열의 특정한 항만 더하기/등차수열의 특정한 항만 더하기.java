class Solution {
    public int solution(int a, int d, boolean[] included) {
        int sum = 0;
        int a1 = a;
        if(included[0]){
            sum = a;
        }
        for(int i = 1; i < included.length; i++){
            a1 += d;
            if(included[i]){
                sum += a1;
            }
        }
        return sum;
    }
}