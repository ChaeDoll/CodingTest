// 문제008 - '좋은 수' 구하기 (백준 1253 [골드4])
#include <iostream>
#include <algorithm>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false); // 입출력 동기화 비활성화
    cin.tie(NULL); // cin과 cout의 묶음을 해제
    long N;
    cin>>N;
    long arr[N];
    for (int i = 0; i < N; i++) {
        cin>>arr[i];
    }
    sort(arr, arr+N);
    long count = 0;
    for (int i=0; i<N; i++){
        long A = 0;
        long B = N-1;
        while(A<B){
            long sum = arr[A]+arr[B];
            if (sum < arr[i]){
                A++;
            } else if (sum > arr[i]){
                B--;
            } else {
                if (A!=i && B!=i){
                    count++;
                    break;
                } else if (A==i){
                    A++;
                } else {
                    B--;
                }
            }
        }
    }
    cout<<count;
    return 0;
}