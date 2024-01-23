import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        answer = answer - lost.length;
        for(int i=0; i<lost.length;i++)
            for(int j=0; j<reserve.length;j++)
                if(lost[i]==reserve[j]&&lost[i]!=100){
                    lost[i]=100;
                    reserve[j]=100;
                    answer++;
                }
        for(int i=0; i<lost.length;i++)
            for(int j=0; j<reserve.length;j++)
                if(lost[i]-reserve[j]==1||reserve[j]-lost[i]==1){
                    lost[i]=100;
                    reserve[j]=100;
                    answer++;
                }
        return answer;
    }
}