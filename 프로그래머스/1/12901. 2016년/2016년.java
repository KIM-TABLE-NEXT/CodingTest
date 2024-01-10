class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int total = 0;
        switch(a){
            case 1:
                total+=b;
                break;
            case 2:
                total+=31+b;
                break;
            case 3:
                total+=60+b;
                break;
            case 4:
                total+=91+b;
                break;
            case 5:
                total+=121+b;
                break;
            case 6:
                total+=152+b;
                break;
            case 7:
                total+=182+b;
                break;
            case 8:
                total+=213+b;
                break;
            case 9:
                total+=244+b;
                break;
            case 10:
                total+=274+b;
                break;
            case 11:
                total+=305+b;
                break;
            case 12:
                total+=335+b;
                break;
        }
        answer = day[total%7];
        return answer;
    }
}