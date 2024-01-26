import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> key = new HashMap<>();

        for (String s : keymap) {
            char[] charArray = s.toCharArray();
            for (int i = 1; i <= charArray.length; i++) {
                if (!key.containsKey(charArray[i - 1])) {
                    key.put(charArray[i - 1], i);
                } else {
                    key.put(charArray[i - 1], Math.min(key.get(charArray[i - 1]), i));
                }
            }
        }
        
        for(int i=0; i<targets.length;i++){
            char[] charArray = targets[i].toCharArray();
            int count = 0;
            for (int j = 1; j <= charArray.length; j++) {
                if (!key.containsKey(charArray[j - 1])) {
                    answer[i] = -1;
                    break;
                } else {
                    count += key.get(charArray[j - 1]);
                }
            }
            if(answer[i]!=-1)
            answer[i] = count;
        }
        
        return answer;
    }
}