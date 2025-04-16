//대문자 소문자 변환 (230323)
using System;

public class Solution {
    public string solution(string my_string) {
        int[] answer = new int[my_string.Length];
        for (int i=0; i<my_string.Length; i++){
            answer[i]=(int)my_string[i];
        }
        for (int i=0; i<answer.Length; i++){
            if (answer[i]<=90) answer[i]+=32;
            else answer[i]-=32;
        }
        char[] result = new char[answer.Length];
        for (int i=0; i<answer.Length; i++){
            result[i]=(char)answer[i];
        }
        string a = new string(result);
        return a;
    }
}