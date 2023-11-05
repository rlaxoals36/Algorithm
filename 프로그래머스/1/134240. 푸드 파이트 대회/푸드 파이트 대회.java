class Solution {
    public String solution(int[] food) {
        StringBuffer answer = new StringBuffer();
        for(int i = 1; i < food.length; i++){
            if(food[i]/2 >= 1){
                for(int j = 0; j < food[i]/2; j++){
                    answer.append(i);
                }
            }
        }
        String str = answer.toString() + "0" + answer.reverse().toString();
        return str;
    }
}