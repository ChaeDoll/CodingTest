// 문제027 - 미로 탐색하기 (백준 2178 [실버1])
#include <iostream>
#include <string>
#include <queue>
using namespace std;

int flagList[100][100] = { 0 };
int arr[100][100];
queue<pair<int, int>> q;

void findMaze(int maxY, int maxX){
    int y=0, x=0;
    q.push(make_pair(0, 0));
    flagList[0][0] = 1;
    while(!q.empty()){
        int firstY = q.front().first;
        int firstX = q.front().second;
        q.pop();
        for (int i=0; i<4; i++){
            if (i==0){ //상
                if (firstY-1>=0 && flagList[firstY-1][firstX]==0 && arr[firstY-1][firstX]==1){
                    q.push(make_pair(firstY-1, firstX));
                    flagList[firstY-1][firstX] = flagList[firstY][firstX]+1;
                } 
            } else if (i==1){ //우
                if (firstX+1<=maxX-1 && flagList[firstY][firstX+1]==0 && arr[firstY][firstX+1]==1){
                    q.push(make_pair(firstY, firstX+1));
                    flagList[firstY][firstX+1] = flagList[firstY][firstX]+1;
                } 
            } else if (i==2){ //하
                if (firstY+1<=maxY-1 && flagList[firstY+1][firstX]==0 && arr[firstY+1][firstX]==1){
                    q.push(make_pair(firstY+1, firstX));
                    flagList[firstY+1][firstX] = flagList[firstY][firstX]+1;
                } 
            } else if (i==3){ //좌
                if (firstX-1>=0 && flagList[firstY][firstX-1]==0 && arr[firstY][firstX-1]==1){
                    q.push(make_pair(firstY, firstX-1));
                    flagList[firstY][firstX-1] = flagList[firstY][firstX]+1;
                } 
            }
        }
    }
    cout<<flagList[maxY-1][maxX-1];
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int N, M;
    cin>>N>>M;
    for(int i=0; i<N; i++){
        string line;
        cin>>line;
        for (int j=0; j<line.length(); j++){
            arr[i][j] = line[j]-'0';
        }
    }
    // 0, 0부터 N-1, M-1 칸 까지 이동하기 위해 밟아야 하는 최수 칸수
    // BFS를 활용하여 최소 칸수를 구한다. (최단 경로 탐색)
    findMaze(N, M);
    return 0;
}