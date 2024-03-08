class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int zeroCnt = 0;
        for(int i = 0; i < lottos.length; i++) {
            if(lottos[i] == 0) zeroCnt++;
        }
        for(int i = 0; i < lottos.length; i++) {
            for(int j = 0; j < lottos.length; j++) {
                if(lottos[i] == win_nums[j]) {
                    count++;
                    break;
                }
            }
        }
        
        int max = count + zeroCnt;
        int min = count;
        
        int[] rank = {6,6,5,4,3,2,1};
        answer[0] = rank[count + zeroCnt];
        answer[1] = rank[count];
        return answer;
    }
}