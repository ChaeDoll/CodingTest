//배열 원소의 길이 (230329)
using System;

public class Solution {
    public int[] solution(string[] strlist) {
        int[] answer = new int[strlist.Length];
        for (int i=0; i<strlist.Length; i++) {
            answer[i]=strlist[i].Length;
        }
        return answer;
    }
}