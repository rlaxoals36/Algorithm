class Solution {
    
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0); // 4 1 2 1 이지만 4의 +, - 때문에 0부터 시작
        return answer;
    }
    
    public void dfs(int[] numbers, int target, int depth, int sum) {
        if(depth == numbers.length) {
            if(sum == target) {
                answer++;
                return;
            }
        } else {
            dfs(numbers, target, depth + 1, sum + numbers[depth]);
            dfs(numbers, target, depth + 1, sum - numbers[depth]);   
        }
    }
}