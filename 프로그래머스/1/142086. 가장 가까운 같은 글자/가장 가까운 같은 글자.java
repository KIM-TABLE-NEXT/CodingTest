import java.util.*;
class Solution {
    public int[] solution(String s) {
        char[] str = s.toCharArray();
        int[] answer = new int[str.length];
        int[][] index = new int[str.length][2];
        boolean top = false;
        for(int i=0; i<str.length; i++)
            index[i][0] = str[i];
        index[0][1] = -1;
        for(int i=1;i<str.length;i++){
            top = false;
            for(int j=i-1;j>-1;j--){
                if(index[i][0]==index[j][0]){
                    index[i][1] = i-j;
                    top = true;
                    break;
                }
                else
                    top = false;
            }
            if(!top)
                index[i][1] = -1;
        }
        for(int i=0; i<str.length; i++)
            answer[i] = index[i][1];
        
        return answer;
    }
}