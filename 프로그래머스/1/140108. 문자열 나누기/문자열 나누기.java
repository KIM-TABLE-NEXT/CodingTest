import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        int same=0;
        int diff=0;
        char temp = '@';
        char[] str = s.toCharArray();
        for(int i=0; i<str.length;i++){
            if(temp=='@'&&i==str.length-1){
                answer++;
                break;
            }
            else if(temp=='@'){
                temp=str[i];
        }
            if(str[i]==temp)
                same++;
            else
                diff++;
            if(same==diff){
                answer++;
                temp='@';
            }
    }
        if(same!=diff)
            answer++;
                return answer;
}
}