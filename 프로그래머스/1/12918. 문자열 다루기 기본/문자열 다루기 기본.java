class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        int ans = 0;
        int size = s.length();
        char[] str = new char[size];
        int[] ascii = new int[size];
        str = s.toCharArray();
        for(int i=0; i<size;i++)
            ascii[i] = str[i];
        if(size==4||size==6)
            for(int j=0; j<size; j++){
                if(ascii[j]>47&&ascii[j]<58)
                    answer = true;
                else{
                    answer = false;
                    break;
                }
            }
        return answer;
    }
}