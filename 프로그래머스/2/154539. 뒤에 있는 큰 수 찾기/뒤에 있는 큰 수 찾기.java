import java.util.Stack;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = numbers.length-1; i>-1; i--){
            while (!stack.empty() && numbers[i] >= stack.peek()){
                stack.pop();
            }
            
            if(!stack.empty())
                answer[i] = stack.peek();
            
            else
                answer[i] = -1;
            
            stack.push(numbers[i]);
        }
        return answer;
    }
}
