class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        for(int i=1; i<count+1; i++){
            sum += i;
        }
        sum = sum*price;
        answer = sum - money;
        if(answer<0)
            answer = 0;
        return answer;
    }
}