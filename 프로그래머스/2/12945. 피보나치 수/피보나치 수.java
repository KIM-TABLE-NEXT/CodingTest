import java.util.*;

class Solution {
    public int solution(int n) {        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<n+1; i++){
            if(i==0)
                map.put(0, 0);
            else if(i==1)
                map.put(1, 1);
            else
                map.put(i, (map.get(i-2) + map.get(i-1))%1234567);
        }
        
        return map.get(n);
    }
}