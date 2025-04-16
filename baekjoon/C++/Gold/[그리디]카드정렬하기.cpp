// 문제033 - 카드 정렬하기 (백준 1715 [골드4])
#include <iostream>
#include <queue>
#include <vector>
#include <functional>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    priority_queue<long, vector<long>, greater<long>> pq;
    long N;
    cin>>N;
    for (int i=0; i<N; i++){
        long num;
        cin>>num;
        pq.push(num);
    }
    long compCount = 0;
    long num1, num2, sumCard;
    while (pq.size()>1){
        num1 = pq.top();
        pq.pop();
        num2 = pq.top();
        pq.pop();
        sumCard = num1 + num2;
        pq.push(sumCard);
        compCount += sumCard;
    }
    cout<<compCount;
    return 0;
}