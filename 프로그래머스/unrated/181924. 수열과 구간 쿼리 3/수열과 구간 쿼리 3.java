class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int a = 0;
        for (int i = 0; i < queries.length; i++){
            a = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = a;
        }
        return arr;
    }
}