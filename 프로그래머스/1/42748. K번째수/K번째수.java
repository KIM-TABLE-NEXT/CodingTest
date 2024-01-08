import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] arr = new int[100];
        int start;
        int end;
        int num;
        int k = 0;
        for(int i=0; i<commands.length;i++){
            for(int j=0; j<100;j++)
                arr[j] = 999;
            k=0;
            start = commands[i][0];
            end = commands[i][1];
            num = commands[i][2];
            for(int j = start-1; j<end; j++)
                arr[k++] = array[j];
            Arrays.sort(arr);
            answer[i] = arr[num-1];
        }
        return answer;
    }
}