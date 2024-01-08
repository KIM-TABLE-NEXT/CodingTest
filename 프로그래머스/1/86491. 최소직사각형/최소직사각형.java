class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[][] size = new int[sizes.length][2];
        int max_w = 0;
        int max_h = 0;
        
        for(int i=0; i<sizes.length;i++){
            if(sizes[i][0]<=sizes[i][1]){
                size[i][0] = sizes[i][0];
                size[i][1] = sizes[i][1];
            }
            else{
                size[i][0] = sizes[i][1];
                size[i][1] = sizes[i][0];
            }
        }
        max_w = size[0][0];
        max_h = size[0][1];
        for(int i=0; i<sizes.length;i++){
            if(max_w<=size[i][0])
                max_w = size[i][0];
            if(max_h<=size[i][1])
                max_h = size[i][1];
        }
        answer = max_w * max_h;
        return answer;
    }
}