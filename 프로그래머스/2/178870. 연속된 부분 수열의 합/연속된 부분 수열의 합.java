class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        answer[1] = 2000000;
        int start = 0;
        int end = 0;
        int sum = sequence[0];
        while(start<sequence.length){
            // System.out.printf("start : "+start+"   end : " + end +"\n");
            if(sum==k){
                if(end-start<answer[1] - answer[0]){
                    answer[1] = end;
                    answer[0] = start;
                }
                if(start==sequence.length-1)
                    break;
                if(start<sequence.length-1){
                sum -= sequence[start];
                start++;
                }
            }
            else if(sum>k){
                if(start==sequence.length-1)
                    break;
                if(start<sequence.length-1){
                sum -= sequence[start];
                start++;
                }
            }
            
            else if(sum<k){
            if(end==sequence.length-1)
                    break;
            if(end<sequence.length-1){
                end++;
                sum += sequence[end];
                }
            }
        }
        return answer;
    }
}