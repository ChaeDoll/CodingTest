//정수 num에서 0~9까지의 숫자 k의 값이 몇번째 자리에 존재하는지 찾기 (230314)  
using System;

public class Solution {
    public int solution(int num, int k) {
        string number = num.ToString();
        char key = Convert.ToChar(k.ToString());
        for (int i=0; i<number.Length; i++){
            if(number[i]==key) return i+1;
        }
        return -1;
    }
}