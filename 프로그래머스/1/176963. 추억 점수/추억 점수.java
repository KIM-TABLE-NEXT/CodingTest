import java.util.*;

class Solution {
    public List<Integer> solution(String[] name, int[] yearning, String[][] photo) {
        List<Integer> answer = new ArrayList<Integer>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0; i<name.length; i++){
            map.put(name[i], yearning[i]);
        }
        for(String[] p : photo){
            int sum=0;
            for(String n : p){
                if(map.containsKey(n))
                    sum += map.get(n);
                else
                    continue;
            }
            answer.add(sum);
        }
        return answer;
    }
}