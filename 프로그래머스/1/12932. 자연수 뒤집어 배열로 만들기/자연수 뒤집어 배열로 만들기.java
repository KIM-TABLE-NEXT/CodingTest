class Solution {
    public int[] solution(long n) {
        long num=n;
        long div=10000000000L;
        int cnt=0;
        int count=0;
        long[] numbers = new long[11];
        for(int i=0;i<11;i++){
            if((int)(num/div)!=0){
                numbers[i]=(int)(num/div);
                cnt=1;
            }
            if(cnt==1)
                count++;
            num = num%div;
            div = div/10;
        }
        int[] answer = new int[count];
        for(int i=0; i<count; i++)
            answer[i] = (int)numbers[10 - i];
        return answer;
    }
}