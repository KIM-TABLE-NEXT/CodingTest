class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] query : queries){
            int temp = 0;
            temp = arr[query[0]];
            arr[query[0]] = arr[query[1]];
            arr[query[1]] = temp;
        }
        return arr;
    }
}