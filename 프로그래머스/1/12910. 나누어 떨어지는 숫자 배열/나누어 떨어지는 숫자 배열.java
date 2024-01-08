class Solution {
    public int[] solution(int[] arr, int divisor) {
        int size = 0;
        int count = 0;
        int cnt = 0;
        int min = 0;
        int index = 0;
        for(int i=0; i<arr.length;i++)
            if(arr[i]%divisor==0)
                count++;
        
        if(count==0)
            size = 1;
        else
            size = count;
        
        int[] temp = new int[size];
        int[] temp2 = new int[size];
        int[] answer = new int[size];
        
        for(int i=0; i<arr.length;i++)
            if(arr[i]%divisor==0){
                temp[cnt] = arr[i];
                cnt++;
            }
        cnt = 0;
        
        for(int i=0; i<count; i++)
            if(cnt<temp[i])
                cnt=temp[i];
        
        
        for(int j=0; j<count; j++){
            min = cnt;
            for(int i=0; i<count; i++){
                if(min>=temp[i]){
                    if(temp[i]!=0){
                    min = temp[i];
                    index = i;
                    }
                }
            }
            if(min==0)
                break;
            else{
                temp2[j] = min;
                temp[index] = 0;
            }
        }
        
        if(count==0)
            answer[0] = -1;
        else
        for(int i=0; i<count; i++)
            answer[i] = temp2[i];
            
        return answer;
    }
}