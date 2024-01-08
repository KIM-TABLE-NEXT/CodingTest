class Solution {
    public long solution(long n) {
        long answer = 0;
        long num = n;
        int div = 1000000000;
        int[] number = new int[10];
        int[] temp = new int[10];
        int max = 0;
        int cnt=0;
        int count=0;
        int start = 0;
        for(int i=0; i<10; i++){
            number[i] = (int)(num/div);
            if((int)(num/div)!=0)
                start=1;
            if(start==1)
                count++;
            num = num%div;
            div=div/10;
        }
        for(int j=0; j<10; j++){
            max=0;
            cnt=0;
        for(int i=0; i<10; i++){
            if(max<number[i]){
                max=number[i];
                cnt=i;
            }
        }
            temp[j] = max;
            number[cnt]=0;
        }
        for(int i=0; i<count; i++){
            answer = answer*10;
            answer += temp[i];
        }
        return answer;
    }
}