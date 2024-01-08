class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            cnt++;
        }
        answer = sum / cnt;
        return answer;
    }
}