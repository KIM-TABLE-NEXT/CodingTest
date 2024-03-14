import java.util.*;

class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        Map<Double, Long> weightMap = new HashMap<Double, Long>();
        for(int weight : weights){
            Double weight_long = Double.valueOf(weight);
            if(weightMap.containsKey(weight_long))
                weightMap.put(weight_long, weightMap.get(weight_long)+1);
            else
                weightMap.put(weight_long,1L);
        }
        
        for(Double weight_long : weightMap.keySet()){ 
            if(weightMap.containsKey(weight_long)){ // 1 : 1 nC2
                answer+= weightMap.get(weight_long)*(weightMap.get(weight_long)-1)/2;
            }
                
            if(weightMap.containsKey(weight_long*3/2)){ // 3m : 2m
                answer+= weightMap.get(weight_long)*weightMap.get(weight_long*3/2);
            }
            
            if(weightMap.containsKey(weight_long*2)){ // 2m : 4m
                answer+= weightMap.get(weight_long)*weightMap.get(weight_long*2);
            }
            
            if(weightMap.containsKey(weight_long*3/4)){ // 3m : 4m
                answer+= weightMap.get(weight_long)*weightMap.get(weight_long*3/4);
            }

        }
        
        return answer;
    }
}