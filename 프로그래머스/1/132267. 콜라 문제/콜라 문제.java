class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int empty = n;
        int count = 0;
        do{
            count = empty/a;
            empty = empty%a;
            answer += count * b;
            empty += count * b;
        }while(count!=0);
        return answer;
    }
}