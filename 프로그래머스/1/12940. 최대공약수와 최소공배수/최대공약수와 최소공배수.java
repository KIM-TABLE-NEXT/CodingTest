class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max,min = 0;
        if(n>m){
            max = n;
            min = m;
            n = min;
            m = max;
        }
        max = min = 0;
        
        for(int i=1; i<n+1; i++){
            if(n%i==0&&m%i==0)
                max = i;
        }
        
        for(int i=1; i<n*m+1; i++){
            if(i%n==0&&i%m==0){
                min = i;
                break;
            }
        }
        answer[0] = max;
        answer[1] = min;
        return answer;
    }
}