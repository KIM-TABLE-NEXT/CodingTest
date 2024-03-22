import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        int[][] table = new int[id_list.length+1][id_list.length];
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<id_list.length; i++)
            map.put(id_list[i], i);
        
        for(String str : report){
            String[] arr = str.split(" ");
            if(table[map.get(arr[0])][map.get(arr[1])]==0){
                table[map.get(arr[0])][map.get(arr[1])] = 1;
                table[id_list.length][map.get(arr[1])]++;
            }
        }
        
        for(int i=0; i<id_list.length; i++){
            if(table[id_list.length][i]>=k)
                for(int j=0; j<id_list.length; j++){
                    answer[j] += table[j][i];
                }
        }
        return answer;
    }
}