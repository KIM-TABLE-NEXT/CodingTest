class Solution {
    public String solution(int[] food) {
        String answer = "";
        int[] split = new int[food.length];
        for(int i=0; i<food.length; i++)
            split[i] = food[i]/2;
        for(int i=0; i<food.length; i++)
            if(split[i]>0)
            for(int j=0;j<split[i];j++)
            answer += i;
        answer += "0";
        for(int i=food.length-1; i>-1; i--)
            if(split[i]>0)
            for(int j=0;j<split[i];j++)
            answer += i;
        return answer;
    }
}