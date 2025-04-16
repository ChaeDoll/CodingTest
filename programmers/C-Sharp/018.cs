//정수 자릿수들 모두 더하기 (230315)
using System;

public class Solution {
    public int solution(int n) {
        string a = n.ToString();
        int sum=0;
        for (int i=0; i<a.Length; i++){
            sum+=int.Parse(a[i].ToString());
        }
        return sum;
    }
}