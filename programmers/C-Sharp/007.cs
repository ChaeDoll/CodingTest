//M*N크기의 종이를 1*1크기의 종이로 모두 만들기 위해 필요한 가위질 횟수 (230314)
using System;

public class Solution {
    public int solution(int M, int N) {
        if (M==1 && N==1) return 0;
        int count = (M-1)+M*(N-1);
        return count;
    }
}