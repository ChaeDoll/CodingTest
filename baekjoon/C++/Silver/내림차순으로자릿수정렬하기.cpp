// 문제017 - 내림차순으로 자릿수 정렬하기 (백준 1427 [실버5])
#include <iostream>
#include <string>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false); // 입출력 동기화 비활성화
    cin.tie(NULL); // cin과 cout의 묶음을 해제
    string numbers;
    cin>>numbers;
    long arr[numbers.length()];
    for(long i=0; i<numbers.length(); i++){
        arr[i] = numbers[i] - '0';
    }
    for (long i=0; i<numbers.length(); i++){
        long maxIndex = i;
        for (long j=i; j<numbers.length(); j++){
            if(arr[maxIndex] < arr[j]) {
                maxIndex = j;
            }
        }
        long temp = arr[i];
        arr[i] = arr[maxIndex];
        arr[maxIndex] = temp;
    }
    for (long i=0; i<numbers.length(); i++){
        cout<<arr[i];
    }
    return 0;
}