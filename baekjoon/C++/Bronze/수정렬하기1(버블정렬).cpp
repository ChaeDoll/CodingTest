// 문제015 - 수 정렬하기1 (백준 2750 [브론즈1])
#include <iostream>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false); // 입출력 동기화 비활성화
    cin.tie(NULL); // cin과 cout의 묶음을 해제
    long N;
    cin>>N;
    int arr[N];
    for (long i=0; i<N; i++){
        cin>>arr[i];
    }
    for (long i=0; i<N; i++){
        for (long j=1; j<N-i; j++){
            if (arr[j-1]>arr[j]) {
                long temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
    }
    for (long i=0; i<N; i++){
        cout<<arr[i]<<'\n';
    }
    return 0;
}