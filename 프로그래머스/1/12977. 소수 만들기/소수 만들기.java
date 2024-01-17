class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        boolean flag;
        for(int i=0; i<nums.length-2;i++)
            for(int j=i+1;j<nums.length-1;j++)
                for(int k=j+1;k<nums.length;k++){
                    flag=true;
                    for(int a=2; a<nums[i]+nums[j]+nums[k];a++)
                        if((nums[i]+nums[j]+nums[k])%a==0)
                            flag=false;
            if(flag)
                answer++;
                }

        return answer;
    }
}