class Solution {
    public int solution(int a, int b) {
        int i = Integer.parseInt(Integer.toString(a)+b);
        int j = Integer.parseInt(Integer.toString(b)+a);
        if(i<j)
            return j;
        else
            return i;
            
    }
}