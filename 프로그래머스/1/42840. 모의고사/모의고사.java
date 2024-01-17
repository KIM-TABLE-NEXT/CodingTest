class Solution {
    public int[] solution(int[] answers) {

        int[] answer1 = {1,2,3,4,5};
        int[] answer2 = {2,1,2,3,2,4,2,5};
        int[] answer3 = {3,3,1,1,2,2,4,4,5,5};
        int[] count = new int[3];
        int max=0;
        int index=0;
        for(int i=0; i<answers.length; i++){
            if(answers[i]==answer1[i%5])
                count[0]++;
            if(answers[i]==answer2[i%8])
                count[1]++;
            if(answers[i]==answer3[i%10])
                count[2]++;
        }
        for(int i=0; i<3; i++)
            if(max<count[i])
                max = count[i];
        for(int i=0; i<3; i++)
            if(max==count[i])
                index++;
        int[] answer = new int[index];
        index=0;
        for(int i=0; i<3; i++)
            if(max==count[i]){
                answer[index]=i+1;
                index++;
            }
        return answer;
    }
}