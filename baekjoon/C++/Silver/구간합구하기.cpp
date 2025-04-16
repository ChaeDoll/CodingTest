// 문제003 - 구간 합 구하기 (백준 11659 [실버3]) C++
#include <iostream>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false); // 입출력 동기화 비활성화
    cin.tie(NULL); // cin과 cout의 묶음을 해제
    
    int N,M;
    cin>>N>>M;
    int sumArr[N+1];
    sumArr[0]=0;
    for (int i=1; i<=N; i++){
        int value;
        cin>>value;
        sumArr[i] = sumArr[i-1] + value;
    }
    for (int i=0; i<M; i++){
        int start, end;
        cin>>start>>end;
        cout<<sumArr[end]-sumArr[start-1]<<'\n';
    }
    return 0;
}