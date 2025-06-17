class Solution {
    public int solution(int[] num_list) {
        String sum1 = "";
        String sum2 = "";
        for(int a : num_list){
            if(a%2==0)
                sum2+=Integer.toString(a);
            else
                sum1+=Integer.toString(a);
            }
        
        return Integer.parseInt(sum1)+Integer.parseInt(sum2);
    }
}