class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int stage = triangle.length-2;
        int index = 0;
        for(int i=stage; i>-1; i--)
            for(int j = 0; j<triangle[i].length; j++){
                if(triangle[i+1][j]>=triangle[i+1][j+1])
                    triangle[i][j] += triangle[i+1][j];
                else
                    triangle[i][j] += triangle[i+1][j+1];
            }
        
        return triangle[0][0];
    }
}