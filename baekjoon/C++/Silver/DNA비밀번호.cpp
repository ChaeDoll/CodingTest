// 문제009 - DNA 비밀번호 (백준 12891 [실버5])
#include <iostream>
#include <algorithm>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false); // 입출력 동기화 비활성화
    cin.tie(NULL); // cin과 cout의 묶음을 해제
    long length, subLength;
    cin>>length>>subLength;
    char arr[length];
    long count = 0;
    for (int i=0; i<length; i++){
        cin>>arr[i];
    }
    long A, C, G, T;
    cin>>A>>C>>G>>T;
    long start = 0;
    long end = subLength-1;
    long AA, CC, GG, TT;
    AA=0,CC=0,GG=0,TT=0;
    for (int i=0; i<subLength; i++){
        if (arr[i]=='A') {
            AA++;
        } else if (arr[i]=='C'){
            CC++;
        } else if (arr[i]=='G'){
            GG++;
        } else if (arr[i]=='T'){
            TT++;
        }
    }
    if (AA>=A && CC>=C && GG>=G && TT>=T) count++;
    while(end<length-1){
        start++, end++;
        if (arr[end]=='A') {
            AA++;
        } else if (arr[end]=='C') {
            CC++;
        } else if (arr[end]=='G') {
            GG++;
        } else if (arr[end]=='T') {
            TT++;
        }
        if (arr[start-1]=='A') {
            AA--;
        } else if (arr[start-1]=='C') {
            CC--;
        } else if (arr[start-1]=='G') {
            GG--;
        } else if (arr[start-1]=='T') {
            TT--;
        }
        if (AA>=A && CC>=C && GG>=G && TT>=T) count++;
    }
    cout<<count;
    return 0;
}