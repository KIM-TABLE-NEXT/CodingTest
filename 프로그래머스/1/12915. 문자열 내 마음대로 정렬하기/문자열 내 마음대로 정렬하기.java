import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        String[] temp = new String[strings.length];
        String temp2 = " ";
        Arrays.sort(strings);
        for(int i = 0; i < strings.length; i++) {
            temp[i] = strings[i].substring(n, n+1);
        }
        Arrays.sort(temp);
        for(int j=0; j<strings.length;j++){
        for(int i=0; i<strings.length;i++){
            if(strings[i].substring(n, n+1).equals(temp[j])){
            answer[j] = strings[i];
            strings[i] = strings[i].replace(strings[i].substring(n, n+1), "z");
            break;
            }
        }
        }
        return answer;
    }
}