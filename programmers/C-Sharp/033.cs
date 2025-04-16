//가위바위보 (230329)
//묵0, 가위2, 보5 일때 문자열로 입력받는 가위바위보에 모두 이기는 수를 출력
using System;

public class Solution {
    public string solution(string rsp) {
        char[] array = rsp.ToCharArray();
        for (int i=0; i<array.Length; i++){
            if (array[i]=='0') array[i]='5';
            else if (array[i]=='2') array[i]='0';
            else array[i]='2';
        }
        string result = new string(array);
        return result;
    }
}