// 문제006 - 연속된 자연수의 합 구하기 (백준 2018 [실버5])
#include <iostream>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false); // 입출력 동기화 비활성화
    cin.tie(NULL); // cin과 cout의 묶음을 해제
    long N;
    cin>>N;
    long start, end;
    start =1, end = 1;
    long sum = 1;
    long count = 0;
    while(end<=N){
	    // 디버깅용 start와 end값 표시
        // cout<<start<<' ';
        // cout<<end<<'\n';
        if (sum<N){
            sum = sum + ++end;
        } else if (sum>N){
            sum = sum - start++;
        } else {
            count++;
            sum = sum + ++end;
        }
    }
    cout<<count;
    return 0;
}