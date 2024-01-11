class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        boolean flag = true;
        String answer = "";
        for(String word : goal){
            if(cards1[0].equals(word))
                for(int i=0; i<cards1.length-1; i++)
                    cards1[i] = cards1[i+1];
            else if(cards2[0].equals(word))
                for(int i=0; i<cards2.length-1; i++)
                    cards2[i] = cards2[i+1];
            else
                flag = false;
        }
        if(flag)
            answer+="Yes";
        else
            answer+="No";
        return answer;
    }
}