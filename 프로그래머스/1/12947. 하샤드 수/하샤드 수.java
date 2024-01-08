class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int num = x;
        int sum = 0;
        int div = 10000;
        for(int i=0; i<5; i++){
            sum += num/div;
            num = num%div;
            div = div/10;
        }
        if(x%sum!=0)
            answer = false;
        return answer;
    }
}