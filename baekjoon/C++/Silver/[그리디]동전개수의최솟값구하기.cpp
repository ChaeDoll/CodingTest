// 문제032 - 동전 개수의 최솟값 구하기 (백준 11047 [실버3])
#include <iostream>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    long N, price;
    cin>>N>>price;
    long arr[N];
    long moneyIndex = 0;
    long moneyCount = 0;
    for (int i=0; i<N; i++){
        cin>>arr[i];
        if (arr[i]<=price) {
            moneyIndex = i;
        }
    }
    while(price>0){
        long quot = price/arr[moneyIndex];
        moneyCount += quot;
        price -= arr[moneyIndex] * quot;
        moneyIndex--;
    }
    cout<<moneyCount;
    return 0;
}