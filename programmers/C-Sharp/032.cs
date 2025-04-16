//k의 개수 세기 (230327)
using System;

public class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;
        for (int a=i; a<=j; a++){
            for (int b=0; b<a.ToString().Length; b++){
                string c = a.ToString();
                if (c[b]==char.Parse(k.ToString())) {count++;}
            }
        }
        return count;
    }
}