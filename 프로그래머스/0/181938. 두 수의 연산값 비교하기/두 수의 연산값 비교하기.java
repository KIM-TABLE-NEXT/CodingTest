class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String plus = Integer.toString(a) + Integer.toString(b);
        if(Integer.parseInt(plus)>=2*a*b)
            return Integer.parseInt(plus);
        else
            return 2*a*b;
    }
}