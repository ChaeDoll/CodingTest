//정수 N의 모든 자릿수의 숫자를 더한다 (230314)
using System;

public class Solution {
    public int solution(int n) {
        string number = n.ToString();
        int unit = n.ToString().Length;
        int sum=0;
        for (int i=0; i<unit; i++){
            sum+=int.Parse(number[i].ToString());
        }
        return sum;
    }
}