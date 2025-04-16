// 문제019 - K번째 수 구하기 (백준 11004 [실버5])
#include <iostream>
using namespace std;
long partition(long arr[], long start, long end){
    long pivot = arr[end];
    long A=start;
    long B=start;
    while(B<end){
        if (arr[B]<=pivot){
            long temp = arr[B];
            arr[B] = arr[A];
            arr[A] = temp;
            A++, B++;
        } else {
            B++;
        }
    }
    long temp = arr[end];
    arr[end] = arr[A];
    arr[A] = arr[end];
    return A;
}
void quickSort(long arr[], long start, long end, long K){
    if (start < end) {
        long pivot = partition(arr, start, end);
        if (K==pivot){
            return;
        } else if (K<pivot) {
            quickSort(arr, start, pivot-1, K);
        } else {
            quickSort(arr, pivot+1, end, K);
        }
    }
}
int main()
{
    ios_base::sync_with_stdio(false); // 입출력 동기화 비활성화
    cin.tie(NULL); // cin과 cout의 묶음을 해제
    long N, K;
    cin>>N>>K;
    long arr[N];
    for (int i=0; i<N; i++){
        cin>>arr[i];
    }
    quickSort(arr, 0, N-1, K-1);
    for(int i=0; i<N; i++){
        cout<<arr[i];
    }
    return 0;
}  