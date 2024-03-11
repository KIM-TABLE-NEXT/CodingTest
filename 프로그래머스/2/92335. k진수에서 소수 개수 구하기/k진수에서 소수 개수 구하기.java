import java.util.*;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String number = Integer.toString(n,k);
        List<String> nums = new ArrayList<>(List.of(number.split("0")));
 
        for (String str : nums) {
            if (str.equals("")) {
                continue;
            }
            if (isPrime(Long.parseLong(str))) {
                answer++;
            }
        }
 
        return answer;
    }
 
    public static boolean isPrime(long checkNum) {
        if (checkNum == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(checkNum); i++) {
            if (checkNum % i == 0) {
                return false;
            }
        }
        return true;
    }
}