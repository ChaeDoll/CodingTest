// 문제034 - 수를 묶어서 최댓값 만들기 (백준 1744 [실버3])
#include <iostream>
#include <queue>
#include <functional>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    priority_queue<long, vector<long>, greater<long>> minusPq;
    priority_queue<long, vector<long>, less<long>> plusPq;
    long zeroCount = 0;
    long oneCount = 0;
    long N;
    cin>>N;
    for(long i=0; i<N; i++){
        long num;
        cin>>num;
        if (num>1){
            plusPq.push(num);
        } else if (num<0){
            minusPq.push(num);
        } else if (num==1){
            oneCount++;
        } else if (num==0){
            zeroCount++;
        }
    }
    long num1, num2;
    long sum = 0;
    while(plusPq.size()>1){
        num1 = plusPq.top();
        plusPq.pop();
        num2 = plusPq.top();
        plusPq.pop();
        sum+= num1 * num2;
    }
    if (plusPq.size()==1){
        sum += plusPq.top();
    }
    while(minusPq.size()>1){
        num1 = minusPq.top();
        minusPq.pop();
        num2 = minusPq.top();
        minusPq.pop();
        sum += num1 * num2;
    }
    if (minusPq.size()==1 && zeroCount==0){
        sum += minusPq.top();
    }
    sum += oneCount;
    cout<<sum;
    return 0;
}