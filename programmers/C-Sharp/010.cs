//나머지가 1이 되는 숫자 찾기 (230314)
using System;

public class Solution {
    public int solution(int n) {
        int i=0;
        for (i=2; i<n; i++) if (n%i==1) break;
        return i;
    }
}