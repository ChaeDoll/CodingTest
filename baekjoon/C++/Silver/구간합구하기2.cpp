// 문제004 - 구간 합 구하기 2 (백준 11660 [실버1]) C++
#include <iostream>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false); // 입출력 동기화 비활성화
    cin.tie(NULL); // cin과 cout의 묶음을 해제
    
    int N,tryCount;
    cin>>N>>tryCount;
    int matrix[N+1][N+1];
    for(int i=1; i<=N; i++){
        for(int j=1; j<=N; j++){
            int value;
            cin>>value;
            matrix[i][j]=matrix[i][j-1]+matrix[i-1][j]-matrix[i-1][j-1]+value;
        }
    }
    for(int i=0; i<tryCount; i++){
        int X1,X2,Y1,Y2;
        cin>>X1>>X2>>Y1>>Y2;
        cout<<matrix[Y1][Y2]-matrix[X1-1][Y2]-matrix[Y1][X2-1]+matrix[X1-1][X2-1]<<'\n';
    }
    return 0;
}