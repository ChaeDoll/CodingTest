//암호 해독 (230318)
using System;

public class Solution {
    public string solution(string cipher, int code) {
        string answer = "";
        for (int i=code; i<=cipher.Length; i+=code) {
            answer+=cipher[i-1];
        }
        return answer;
    }
}