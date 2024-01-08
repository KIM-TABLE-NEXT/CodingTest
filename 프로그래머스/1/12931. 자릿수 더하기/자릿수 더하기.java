import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int div = 100000000;
        int num = n;
        for(int i=0;i<8;i++){
            if(num/div!=0)
                answer+=num/div;
            num = num%div;
            div = div/10;
        }
        answer += num;
        return answer;
    }
}