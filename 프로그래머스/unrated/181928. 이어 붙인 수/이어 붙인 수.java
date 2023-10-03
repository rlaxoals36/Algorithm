class Solution {
    public int solution(int[] num_list) {
        String a = "";
        String b = "";
        for(int num:num_list){
            if(num%2==0){
                a += Integer.toString(num);
            } else {
                b += Integer.toString(num);
            }
        }
        return Integer.parseInt(a) + Integer.parseInt(b);
    }
}