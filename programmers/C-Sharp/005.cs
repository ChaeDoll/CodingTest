//배열 원소 2배 만들기 (230313)
using System;

public class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = numbers;
        for (int i=0; i<numbers.Length; i++){
            answer[i]=numbers[i]*2;
        }
        return answer;
    }
}