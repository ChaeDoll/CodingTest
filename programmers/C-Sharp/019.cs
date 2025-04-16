//배열의 유사도 검사 (230315)
using System;

public class Solution {
    public int solution(string[] s1, string[] s2) {
        int answer=0;
        int len1 = s1.Length;
        int len2 = s2.Length;
        for (int i=0; i<len1; i++){
            for (int j=0; j<len2; j++){
                if (s1[i]==s2[j]) answer++;
            }
        }
        return answer;
    }
}