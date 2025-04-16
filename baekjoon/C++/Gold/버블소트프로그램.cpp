// 문제016 - 버블 소트 프로그램 (백준 1377 [골드2])
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false); // 입출력 동기화 비활성화
    cin.tie(NULL); // cin과 cout의 묶음을 해제
    long N;
    cin>>N;
    vector<pair<int,int>> arr(N);
    for (long i=0; i<N; i++){
        cin>>arr[i].first;
        arr[i].second = i;
    }
    sort(arr.begin(), arr.end());
    long countMax = 0;
    for (long i=0; i<N; i++){
        if (countMax < arr[i].second - i){
            countMax = arr[i].second - i;
        }
    }
    countMax++;
    cout<<countMax;
    return 0;
}