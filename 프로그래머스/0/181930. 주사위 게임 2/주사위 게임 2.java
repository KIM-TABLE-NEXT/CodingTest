class Solution {
    public int solution(int a, int b, int c) {
        int sum = 0;
        if(a==b)
            sum++;
        if(a==c)
            sum++;
        if(b==c)
            sum++;
        if(sum==0)
            return a+b+c;
        else if(sum==1)
            return (a+b+c)*(a*a+b*b+c*c);
        else
            return (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
    }
}