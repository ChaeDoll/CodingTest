// 문제021 - 버블 소트 프로그램 2 (백준 1517 [플래티넘])
#include <iostream>
using namespace std;
void mergeSort(long arr[], long tmp[], long start, long end, long *swapCount){
    if (end-start<1) {
        return;
    }
    long mid = start + (end-start)/2;
    mergeSort(arr, tmp, start, mid, swapCount);
    mergeSort(arr, tmp, mid+1, end, swapCount);
    for (long i=start; i<=end; i++){
        tmp[i]=arr[i];
    }
    long arrIndex = start;
    long index1 = start;
    long index2 = mid+1;
    while (index1 <= mid && index2 <= end){
        if (tmp[index1]>tmp[index2]){
            arr[arrIndex] = tmp[index2];
            *swapCount = *swapCount + index2 - arrIndex;
            arrIndex++;
            index2++;
        } else {
            arr[arrIndex] = tmp[index1];
            arrIndex++;
            index1++;
        }
    }
    while (index1 <= mid) {
        arr[arrIndex] = tmp[index1];
        arrIndex++;
        index1++;
    } 
    while (index2 <= end) {
        arr[arrIndex] = tmp[index2];
        arrIndex++;
        index2++;
    }
}
int main()
{
    ios_base::sync_with_stdio(false); // 입출력 동기화 비활성화
    cin.tie(NULL); // cin과 cout의 묶음을 해제
    long N;
    cin>>N;
    long arr[N];
    long tmp[N];
    long swapCount = 0;
    for (long i=0; i<N; i++){
        cin>>arr[i];
    }
    mergeSort(arr, tmp, 0, N-1, &swapCount);
    cout<<swapCount;
    return 0;
}