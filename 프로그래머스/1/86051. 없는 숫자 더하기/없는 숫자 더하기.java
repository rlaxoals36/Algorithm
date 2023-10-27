class Solution {
    public int solution(int[] numbers) {
        int a = 45;
        for(int number:numbers){
            a -= number;
        }
        return a;
    }
}