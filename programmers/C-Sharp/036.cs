//물건 구매가능 개수와 잔돈 (230402)
using System;

public class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        answer[0]=money/5500;
        answer[1]=money%5500;
        return answer;
    }
}