import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] rank = new int[k];
        for(int i=0; i<k; i++)
            rank[i] = -1;
        for(int i=0; i<score.length; i++){
            if(rank[0]<=score[i])
                rank[0] = score[i];
            Arrays.sort(rank);
            for(int j=0; j<k; j++){
            if(rank[j]>-1){
            answer[i] = rank[j];
                break;
            }
            else{}
            }
        }
        return answer;
    }
}