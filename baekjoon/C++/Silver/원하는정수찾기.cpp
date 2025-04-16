// 문제029 - 원하는 정수 찾기 (백준 1920 [실버4])
#include <iostream>
#include <algorithm>
using namespace std;

void search(long arr[], long findNum, int start, int end) {
    int mid = (start+end)/2;
    if (arr[mid] == findNum){
        cout<<"1"<<'\n';
        return;
    }
    if (start>=end){
        cout<<"0"<<'\n';
        return;
    }
    if (arr[mid] < findNum){
        search(arr, findNum, mid+1, end);
    } else if (arr[mid] > findNum){
        search(arr, findNum, start, mid-1);
    }
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int N;
    cin>>N;
    long arr[N];
    for (int i=0; i<N; i++){
        long number;
        cin>>number;
        arr[i] = number;
    }
    sort(arr, arr+N);
    int M;
    cin>>M;
    for (int i=0; i<M; i++){
        long findNum;
        cin>>findNum;
        search(arr, findNum, 0, N-1);
    }
    return 0;
}