//숫자 비교하기 (230313)
//두 숫자가 같으면 1, 다르면 -1을 반환
using System;
public class Solution {
    public int solution(int num1, int num2) {
        int answer;
        if (num1 == num2){
            answer = 1;
        }
        else {
            answer = -1;
        }
        return answer;
    }
}