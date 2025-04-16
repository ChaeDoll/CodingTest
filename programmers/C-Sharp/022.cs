//정수 n의 약수를 구하여 배열로 출력 (230316)
using System;
using System.Collections;

public class Solution {
    public int[] solution(int n) {
        ArrayList arr = new ArrayList();
        for (int i=1; i<=n; i++){
            if (n%i==0) arr.Add(i);
        }
        int[] answer = new int[arr.Count];
        for (int i=0; i<arr.Count; i++)
            answer[i]=(int)arr[i];
        return answer;
    }
}