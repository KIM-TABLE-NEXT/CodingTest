import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int orange : tangerine){
            if(map!=null&&map.containsKey(orange))
                map.put(orange, map.get(orange)+1);
            else
                map.put(orange, 1);
        }
        
        Set<Integer> keySet = map.keySet();
        List<Integer> size = new ArrayList<>();
        for(int key : keySet)
            size.add(map.get(key));
        
        Collections.sort(size);
        Collections.reverse(size);
        for(int s : size){
            if(k>s){
                k = k-s;
                answer++;
            }
            else if(k<=s){
                answer++;
                break;
            }
        }
            
        return answer;
    }
}