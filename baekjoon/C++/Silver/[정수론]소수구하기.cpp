// 문제037 - 소수 구하기 (백준 1929 [실버3])
#include <iostream>
#include <vector>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    long M, N;
    cin>>M>>N;
    bool arr[N+1];
    if (M==1) M=2;
    for(long i=2; i<=N; i++){
        arr[i]=true;
    }
    for(long i=2; i<=N; i++){
        if (!arr[i]) continue;
        for(long j=i*i; j<=N; j+=i){
            arr[j] = false;
        }
    }
    for(long i=M; i<=N; i++){
        if (!arr[i]) continue;
        cout<<i<<'\n';
    }
    return 0;
}