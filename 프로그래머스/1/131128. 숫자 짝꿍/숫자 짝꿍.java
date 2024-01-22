import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        String number = "";
        char[] arr_x = X.toCharArray();
        char[] arr_y = Y.toCharArray();
        int[] int_x = new int[10];
        int[] int_y = new int[10];
        for(int i=0; i<arr_x.length;i++)
            int_x[Character.getNumericValue(arr_x[i])]++;
        for(int i=0; i<arr_y.length;i++)
            int_y[Character.getNumericValue(arr_y[i])]++;
        StringBuilder sb1 = new StringBuilder();
        for(int i=0; i<10; i++){
            if(int_y[i]<int_x[i])
                int_x[i] = int_y[i];
            for(int j=0; j<int_x[i];j++)
            sb1.append(Integer.toString(i));
        }
        char[] num = sb1.toString().toCharArray();
        if(num.length==0)
            return "-1";
        Arrays.sort(num);
        if(num[num.length-1]=='0')
            return "0";
        StringBuilder sb2 = new StringBuilder();
        for(int i=num.length-1;i>-1;i--)
            sb2.append(num[i]);
        answer = sb2.toString();
        return answer;
    }
}