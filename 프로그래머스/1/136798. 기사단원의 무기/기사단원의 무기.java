class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int count = 0;
        for(int i=1;i<number+1;i++){
            count=0;
            for(int j=1; j<(int)(Math.sqrt(i))+1;j++)
                if(i%j==0){
                    count+=2;
                    if(i/j==j)
                        count--;
                }
            if(count>limit)
                answer+=power;
            else
                answer+=count;
        }
        return answer;
    }
}