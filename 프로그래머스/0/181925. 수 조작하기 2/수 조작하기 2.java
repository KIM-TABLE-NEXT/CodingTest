class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i=0; i<numLog.length-1; i++){
            int n=0;
            n = numLog[i+1] - numLog[i];
            if(n==1)
                answer+='w';
            else if(n==-1)
                answer+='s';
            else if(n==10)
                answer+='d';
            else
                answer+='a';
        }
        return answer;
    }
}