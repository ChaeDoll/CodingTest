// 문제005 - 나머지 합 구하기 (백준 10986 [골드3])
#include <iostream>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false); // 입출력 동기화 비활성화
    cin.tie(NULL); // cin과 cout의 묶음을 해제
    long N,M;
    cin>>N>>M;
    long sumArr[N];
    long cntArr[M];
    long count = 0;
    long value;
    cin>>value;
    sumArr[0] = value;
    for(long i=1; i<N; i++){
        cin>>value;
        sumArr[i]=sumArr[i-1]+value;
    }
    for(long i=0; i<M; i++){
        cntArr[i]=0;
    }
    for(long i=0; i<N; i++){
        long reminder = sumArr[i]%M;
        if (reminder==0) count++;
        cntArr[reminder]++;
    }
    for(long i=0; i<M; i++){
        if (cntArr[i]>=2) count += (cntArr[i]*(cntArr[i]-1)/2);
    }
    cout<<count;
    return 0;
}