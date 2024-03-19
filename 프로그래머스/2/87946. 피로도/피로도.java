import java.util.*;

class Solution {
    public boolean[] isvisited;
    public int[][] field;
    
    public int solution(int k, int[][] dungeons) {
        this.isvisited = new boolean[dungeons.length];
        this.field = dungeons;
        return search(k);
    }
    
    public int search(int health){
        int answer = 0;
        int count = 0;
        
        for(int i=0; i<this.field.length; i++)
            if(!isvisited[i]&&health>=this.field[i][0]){
                this.isvisited[i] = true;
                answer = Math.max(answer, search(health-this.field[i][1]));
                if(answer==this.field.length)
                    return answer;
                this.isvisited[i] = false;
            }
        
        for(boolean b : this.isvisited)
            if(b)
                count++;
        
        return Math.max(answer,count);
    }
}