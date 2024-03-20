import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(citations);
        
        for(int i = 0; i<citations.length; i++){
            if(i==0){
                for(int j=0; j<citations[i]+1; j++)
                map.put(j,citations.length);
            }
            else if(citations[i]!=citations[i-1]){
                for(int j=citations[i]; j>citations[i-1]; j--)
                map.put(j,citations.length-i);
            }  
        }
        
        Set<Integer> keySet = map.keySet();
        
        for(int key : keySet)
            if(key<=map.get(key))
                answer = key;
        
        return answer;
    }
}