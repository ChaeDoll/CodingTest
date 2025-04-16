//3,6,9 게임 (230320)
using System;

public class Solution {
    public int solution(int order) {
        string a=order.ToString();
        int clap=0;
        for (int i=0; i<order.ToString().Length; i++){
                if (a[i]=='3'||a[i]=='6'||a[i]=='9') clap++;
        }
        return clap;
    }
}