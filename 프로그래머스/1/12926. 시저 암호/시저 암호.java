class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] str = new char[s.length()];
        str = s.toCharArray();
        for(int i=0; i<s.length();i++){
            if(str[i]==' ')
                answer += " ";
            else if(str[i]+n>'z')
                answer += (char)(str[i]-26+n);
            else if(str[i]<='Z'&&str[i]+n>'Z')
                answer += (char)(str[i]+n-26);
            else
                answer += (char)(str[i] + n);
        }
        System.out.printf("%s",answer);
        return answer;
    }
}