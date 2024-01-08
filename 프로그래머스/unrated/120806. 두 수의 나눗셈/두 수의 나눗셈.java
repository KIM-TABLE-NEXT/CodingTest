class Solution {
    public int solution(float num1, float num2) {
        int answer = 0;
        float i = num1/num2;
        i = i*1000;
        answer = (int)i;
        return answer;
    }
}