class Solution {
    public String solution(int n) {
        String answer = "";
        String str = "수박수박";
        for(int i=0; i<n/4; i++)
            answer += str;
        if(n%4!=0)
            answer += str.substring(0,n%4);
        return answer;
    }
}