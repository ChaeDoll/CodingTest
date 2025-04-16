//OX 퀴즈 (230315)
using System;

public class Solution {
    public string[] solution(string[] quiz) {
        string[] result = new string[quiz.Length];
        for (int i = 0; i<quiz.Length; i++){
            string[] answer = quiz[i].Split(" ");
            if (answer[1]=="+") {
                if(int.Parse(answer[0].ToString())+int.Parse(answer[2].ToString())==int.Parse(answer[4].ToString())) result[i]="O";
                else result[i]="X";
            }
            else if (answer[1]=="-") {
                if(int.Parse(answer[0].ToString())-int.Parse(answer[2].ToString())==int.Parse(answer[4].ToString())) result[i]="O";
                else result[i]="X";
            }
        }
        return result;
    }
}