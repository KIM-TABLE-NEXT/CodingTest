class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int end = s + overwrite_string.length();
        for(int i=0; i<my_string.length();i++){
            if(i<s)
                answer+=my_string.charAt(i);
            else if(i<end)
                answer+=overwrite_string.charAt(i-s);
            else
                answer+=my_string.charAt(i);
        }
        return answer;
    }
}