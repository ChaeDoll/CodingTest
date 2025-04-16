//점의 사분면 구하기 (230329)
using System;

public class Solution {
    public int solution(int[] dot) {
        if (dot[0]>=0 && dot[1]>=0) return 1;
        else if (dot[0]<0 && dot[1]>=0) return 2;
        else if (dot[0]<0 && dot[1]<0) return 3;
        else return 4;
    }
}