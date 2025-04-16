//가변배열 사용한 n의 배수 고르기(230322)
using System;

public class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = new int[0];
        int count=0;
        for (int i=0; i<numlist.Length; i++) {
            if (numlist[i]%n==0) {
                Array.Resize(ref answer, answer.Length+1);
                answer[answer.Length-1]=numlist[i];
            }
        }
        return answer;
    }
}