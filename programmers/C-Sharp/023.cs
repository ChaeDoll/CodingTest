//가장 큰 수를 찾기(230317)
using System;

public class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        answer[0]=array[0];
        for (int i=1; i<array.Length; i++){
            if (array[i]>answer[0]) {
                answer[0]=array[i];
                answer[1]=i;
            }
        }
        return answer;
    }
}