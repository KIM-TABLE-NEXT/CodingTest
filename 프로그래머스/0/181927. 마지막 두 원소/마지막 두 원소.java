import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int max = num_list.length-1;
        int[] answer = Arrays.copyOf(num_list, max+2);
        if(num_list[max]>num_list[max-1])
            answer[max+1] = num_list[max] - num_list[max-1];
        else
            answer[max+1] = num_list[max]*2;
        return answer;
    }
}