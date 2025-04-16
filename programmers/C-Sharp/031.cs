//3x 숫자 안쓰기 (230327)
using System;

public class Solution {
    public int solution(int n) {
        int count = 0;
        int answer = 0;
        while (count!=n) {
            answer++;
            count++;
            while (answer.ToString().Contains("3") || answer%3==0) {
                answer++;
            }
        }
        return answer;
    }
}