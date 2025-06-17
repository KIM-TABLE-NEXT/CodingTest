class Solution {
    public int solution(int[] num_list) {
        int sum1 = 1;
        int sum2 = 0;
        for(int a : num_list){
            sum1 = sum1*a;
            sum2+=a;
        }
        if(sum1<sum2*sum2)
            return 1;
        else
            return 0;
    }
}