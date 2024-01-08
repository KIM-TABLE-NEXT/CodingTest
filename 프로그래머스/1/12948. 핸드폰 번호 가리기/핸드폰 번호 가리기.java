class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int length = phone_number.length();
        int star = length - 4;
        for(int i=0; i<star; i++)
            answer += "*";
        answer+= phone_number.substring(star,length);
        return answer;
    }
}