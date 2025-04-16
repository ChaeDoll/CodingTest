//등차 혹은 등비수열 사용하여 다음값 구하기 (230319)
using System;

public class Solution {
    public int solution(int[] common) {
        int key;
        int answer;
        if (common[2]-common[1]==common[1]-common[0]) {
            key=common[2]-common[1];
            answer=common[common.Length-1]+key;
        }
        else {
            key=common[2]/common[1];
            answer=common[common.Length-1]*key;
        }
        return answer;
    }
}