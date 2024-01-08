class Solution {
    public String solution(String s) {
        String answer = "";
        int size = s.length();
        int min = 0;
        int index = 0;
        char[] temp = new char[size];
        int[] tempint = new int[size];
        char[] temp2 = new char[size];
        
        temp = s.toCharArray();
        for(int a=0; a<size; a++)
            tempint[a] = temp[a];
        
        for(int j=0; j<size; j++){
            index = 0;
            min = 64;
        for(int i=0; i<size; i++){
            if(tempint[i]>min){
                min = tempint[i];
                index = i;
            }
        }
            temp2[j] = temp[index];
            tempint[index] = 0;
        }
        
        for(int i=0; i<size; i++)
            answer+=temp2[i];

        return answer;
    }
}