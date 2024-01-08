class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;
        int cnt = 0;
        do{
            if(n%2==0)
                n=n/2;
            else
                n=n*3+1;
            cnt++;
            if(n==1)
                break;
        }while(cnt<500);
        
        answer = cnt;
        if(cnt>=500)
            answer = -1;
        else if(num == 1)
            answer=0;
        return answer;
    }
}