class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];  // (i*k) * (k*j) = (i*j)
        
        for(int i = 0; i < arr1.length; i++) {  // arr1 행의 길이 (i)
            for(int j = 0; j < arr2[0].length; j++) {  // arr2 열의 길이 (j)
                int sum = 0;
                for(int k = 0; k < arr1[0].length; k++) {  // arr1 열의 길이, arr2 행의 길이 (k)
                    sum += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = sum;
            } 
        }
            
        return answer;
    }
}