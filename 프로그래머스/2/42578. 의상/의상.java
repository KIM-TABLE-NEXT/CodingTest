import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> oth = new HashMap<>();
        List<String> category = new ArrayList<>();
        for(int i=0; i<clothes.length;i++){
            if(oth.containsKey(clothes[i][1]))
            oth.put(clothes[i][1], oth.get(clothes[i][1])+1);
            else{
                oth.put(clothes[i][1], 1);
                category.add(clothes[i][1]);
            }
        }
        

        for(String parts : category)
            answer = answer * (oth.get(parts)+1);
        
        answer = answer - 1;
        
        return answer;
    }
}