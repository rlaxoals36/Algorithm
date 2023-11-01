class Solution {
    public int solution(int[][] sizes) {
        int length = 0;
        int width = 0;
        
        for(int i = 0; i < sizes.length; i++){
            int length_max = Math.max(sizes[i][0],sizes[i][1]);
            int width_max = Math.min(sizes[i][0],sizes[i][1]);
            
            if(length_max > length)
                length = length_max;
            if(width_max > width)
                width = width_max;
        }
            
        return length*width;
    }
}