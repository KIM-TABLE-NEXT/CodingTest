class Solution {
    public int solution(int n) {
        int answer = 0;
        int size = 0;
        int temp = 0;
        temp = n;
        do{
            temp = temp/3;
            size++;
        }while(temp>0);
        
        int[] arr = new int[size];
        
        temp = n;

        for(int i=0; i<size; i++){
            arr[i] = temp%3;
            temp = temp/3;
        }
        
        for(int i=0; i<size-1; i++){
            answer += arr[i];
            answer = answer*3;
        }
        answer += arr[size-1];
        return answer;
    }
}