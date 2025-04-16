//정수가 들어있는 배열들에서 7의 개수가 몇개인지 세는 함수 (230314)
using System;

public class Solution {
    public int solution(int[] array) {
        int answer=0;
        for (int i=0; i<array.Length; i++){
            string value = array[i].ToString();
            for (int j=0; j<value.Length; j++){
                if (value[j] == '7') answer++;
            }
        }
        return answer;
    }
}