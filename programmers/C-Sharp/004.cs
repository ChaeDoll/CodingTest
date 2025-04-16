//두 분수를 더하여 결과값을 도출할 것. 약분도 되어야함 (230313)
using System;

public class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer3, denom3;
        denom3 = denom1*denom2; //공통분모
        numer3 = denom2*numer1 + denom1*numer2; //분자 구하는 식
        int gd=1; //최대공약수를 기본 1로 지정
        for (int i=1;i<=numer3;i++){
            if(numer3%i==0 && denom3%i==0){ //i를 1씩 높여가며 둘의 최대공약수를 구함
                gd=i;
            }
        }
        int[] answer = new int[] {numer3/gd,denom3/gd}; //약분하여 값을 대입
        return answer;
    }
}