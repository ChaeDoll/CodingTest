// 문제007 - 주몽의 명령 (백준 1940 [실버4])
#include <iostream>
#include <algorithm>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false); // 입출력 동기화 비활성화
    cin.tie(NULL); // cin과 cout의 묶음을 해제
    long N, M;
    long sum;
    long count = 0;
    cin>>N>>M;
    long arr[N];
    for (int i=0; i<N; i++){
        cin>>arr[i];
    }
    sort(arr, arr+N);
    long A=0, B=N-1;
    while(A<B) {
        sum = arr[A]+arr[B];
        if (sum>M){
            B--;
        } else if (sum<M){
            A++;
        } else {
            count++;
            A++;
            B--;
        }
    }
    cout<<count;
    return 0;
}