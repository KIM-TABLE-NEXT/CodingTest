class Solution {
    public int[] solution(int[] arr) {
        int min = arr[0];
        int size = 0;
        int j=0;
        for(int i=0; i<arr.length;i++)
            if(min>arr[i])
                min = arr[i];

        if(arr.length==1)
            size = 1;
        else
            size = arr.length-1;
            
        int[] answer = new int[size];
        
        if(arr.length==1)
            answer[0] = -1;
        else
            for(int i=0; i<size; i++){
                if(min==arr[j]){
                    answer[i] = arr[j+1];
                    j++;
                }
                else
                    answer[i] = arr[j];
                j++;
            }
        return answer;
    }
}