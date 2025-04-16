//세균번식 함수 n마리의 세균이 1시간마다 2배 증가. t시간 동안 증식한 세균의 총 수 (230314)
using System;

public class Solution {
    public int solution(int n, int t) {
        for (int i=0; i<t; i++) n *= 2;
        return n;
    }
}