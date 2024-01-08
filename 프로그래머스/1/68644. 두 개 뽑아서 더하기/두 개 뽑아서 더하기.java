import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int size = numbers.length;
        int[] sum = new int[size*(size-1)/2];
        int index = 0;
        boolean check = false;
        for(int i=0; i<size-1; i++)
            for(int j=i+1; j<size; j++){
                sum[index] = numbers[i] + numbers[j];
                index++;
            }
    
        Arrays.sort(sum);
        
        if(sum.length>1){
        index=1;
        for(int i = 0; i<sum.length-1; i++){            
            if(sum[i]!=sum[i+1])
                index++;
        }
        int[] answer = new int[index];
            
        index=0;
        answer[index] = sum[0];
        if(answer.length>1){
        for(int i = 0; i<sum.length-1; i++){
            if(sum[i]!=sum[i+1]){
                answer[index] = sum[i];
                answer[index+1] = sum[i+1];
                index++;
            }
        }
            
        if(sum[sum.length-2]!=sum[sum.length-1])
            answer[index] = sum[sum.length-1];
        }
        return answer;
            }
        
        else{
            int[] answer = new int[1];
            answer[0] = sum[0];
            return answer;
        }
    }
}