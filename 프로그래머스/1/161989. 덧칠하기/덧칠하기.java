import java.util.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] wall = new int[n];
        Arrays.fill(wall, 1);
        for(int i=0; i<section.length; i++)
            wall[section[i]-1] = 0;
        for(int i=0; i<wall.length-m;i++)
            if(wall[i]==0){
                for(int j=i; j<i+m;j++)
                    wall[j] = 1;
                answer++;
            }
        for(int i=wall.length-1;i>wall.length-m-1;i--)
            if(wall[i]==0){
                answer++;
                break;
            }
        return answer;
    }
}