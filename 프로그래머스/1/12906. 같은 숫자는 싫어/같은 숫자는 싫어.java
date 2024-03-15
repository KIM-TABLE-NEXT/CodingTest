import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i : arr){
            if(list.size()!=0&&list.get(list.size()-1)==i)
                continue;
            else
                list.add(i);
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++)
            answer[i] = list.get(i);
        
        return answer;
    }
}