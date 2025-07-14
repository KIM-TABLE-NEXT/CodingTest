import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int[][] queries) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int[] query : queries){
            int s = query[0];
            int e = query[1];
            int k = query[2];
            int n = -1;
            for(int i = s; i<e+1; i++){
                if(k<arr[i]){
                    if(n==-1)
                        n=arr[i];
                    else if(arr[i]<n)
                        n=arr[i];
                }
            }
            answer.add(n);
        }
        return answer;
    }
}