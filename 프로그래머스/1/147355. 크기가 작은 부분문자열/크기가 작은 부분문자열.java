class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String str_t = "";
        long num_t = 0;
        char[] arr_t = new char[t.length()];
        
        long num_p = Long.parseLong(p);
        arr_t = t.toCharArray();
        
        for(int i=0; i<t.length()-p.length()+1; i++){
            str_t = "0";
            for(int j=i; j<i+p.length(); j++){
                str_t += arr_t[j];
            }
            num_t = Long.parseLong(str_t);
            if(num_t<=num_p)
                answer++;
        }
        return answer;
    }
}