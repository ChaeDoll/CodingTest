//문자열 내부에 문자열 포함 (230321)
using System;

public class Solution {
    public int solution(string str1, string str2) {
        if (str1.Contains(str2)) return 1;
        else return 2;
    }
}