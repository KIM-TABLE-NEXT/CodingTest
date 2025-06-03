class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        for(int i = 1; i<31; i++){
            int sum=0;
            for(String str : strArr){
                if(str.length()==i)
                   sum++; 
            }
            if(answer<sum)
                answer=sum;
        }
        return answer;
    }
}