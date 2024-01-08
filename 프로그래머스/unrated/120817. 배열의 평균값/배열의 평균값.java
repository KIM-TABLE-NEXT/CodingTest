class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int cnt = 0;
        double sum = 0;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]=='\0')
                break;
            else{
                cnt++;
                sum += numbers[i];
            }
        }
        answer = sum / cnt;
        return answer;
    }
}