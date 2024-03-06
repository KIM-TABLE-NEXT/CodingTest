class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int zero = 0;
        int size=0;
        while(true){
            zero=0;
            for(int i=0;i<s.length();i++)
                if(s.charAt(i)=='0')
                    zero++;
            size = s.length() - zero;
            answer[1] += zero;
            s = Integer.toBinaryString(size);
            answer[0]++;
            if(s.equals("1"))
                break;
        }
        return answer;
    }
}