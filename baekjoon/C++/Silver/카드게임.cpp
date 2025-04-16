// 문제013 - 카드 게임 (백준 2164 [실버4])
#include <iostream>
#include <queue>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false); // 입출력 동기화 비활성화
    cin.tie(NULL); // cin과 cout의 묶음을 해제
    queue<long> cardQueue;
    long N;
    cin>>N;
    for (long i=1; i<=N; i++){
        cardQueue.push(i);
    }
    bool flag=false;
    while(cardQueue.size()>1) {
        if(!flag) {
            cardQueue.pop();
            flag = !flag;
        } else {
            long card = cardQueue.front();
            cardQueue.pop();
            cardQueue.push(card);
            flag = !flag;
        }
    }
    long result = cardQueue.front();
    cout<<result;
    return 0;
}