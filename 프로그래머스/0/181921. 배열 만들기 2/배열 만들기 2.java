import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for(int i = l; i<=r; i++){
            String num = Integer.toString(i);
            int count = 0;
            for(int j=0; j<num.length();j++){
                if(num.charAt(j)=='0'||num.charAt(j)=='5')
                    count++;
            }
            if(count==num.length())
                answer.add(i);
        }
        if(answer.isEmpty())
            answer.add(-1);
        return answer;
    }
}