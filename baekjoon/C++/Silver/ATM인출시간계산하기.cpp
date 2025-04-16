// 문제018 - ATM 인출 시간 계산하기 (백준 11399 [실버3])
#include <iostream>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false); // 입출력 동기화 비활성화
    cin.tie(NULL); // cin과 cout의 묶음을 해제
    long N;
    cin>>N;
    long arr[N];
    long calSum;
    for (long i=0; i<N; i++){
        cin>>arr[i];
    }
    for (long i=1; i<N; i++){
        long index = i;
        for (long j=i-1; j>=0; j--){
            if (arr[index]<arr[j]) {
                long temp = arr[j];
                arr[j] = arr[index];
                arr[index] = temp;
                index--;
            } else {
                break;
            }
        }
    }
    calSum=arr[0];
    for (long i=1; i<N; i++){
        arr[i]=arr[i-1]+arr[i];
        calSum+=arr[i];
    }
    cout<<calSum;
    return 0;
}