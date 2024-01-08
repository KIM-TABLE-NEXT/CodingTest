class Solution {
    public String solution(String s) {
        String answer = "";
        char[] str = new char[s.length()];
        int[] ascii = new int[s.length()];
        int count = 0;
        
        str = s.toCharArray();
        for(int i=0; i<s.length(); i++)
            ascii[i] = str[i];
        
        for(int i=0; i<s.length(); i++){
            if(ascii[i]!=32){
                count++;
                if(count%2==0){
                    if(ascii[i]<91&&ascii[i]>64)
                        ascii[i] = ascii[i] + 32;
                }
                else{
                    if(ascii[i]<123&&ascii[i]>96)
                        ascii[i] = ascii[i] - 32;
                }
            }
            else
                count=0;
        }
        
        
        for(int i=0; i<s.length(); i++)
        answer += (char)ascii[i];
        
        return answer;
    }
}