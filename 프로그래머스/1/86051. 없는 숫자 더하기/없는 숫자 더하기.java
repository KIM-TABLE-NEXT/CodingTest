class Solution {
    public int solution(int[] numbers) {
        int[] num = new int[9];
        for(int i=1; i<10; i++)
            num[i-1] = i;
        for(int i=0; i<9; i++){
            for(int j=0;j<numbers.length;j++){
                if(num[i]==numbers[j])
                    num[i]=0;
            }
        }
        int answer = 0;
        for(int i=0; i<9; i++)
            answer+=num[i];
        return answer;
    }
}