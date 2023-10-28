class Solution {
    public long solution(int price, int money, int count) {
        
        long sum = price;
        int a = price;
        for(int i = 1; i < count; i++){
            price += a;
            sum += price;
        }

        return sum > money ? sum-money : 0;
    }
}