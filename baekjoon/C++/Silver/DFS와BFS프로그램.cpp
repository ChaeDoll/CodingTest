// 문제026 - DFS와 BFS 프로그램 (백준 1260 [실버2])
#include <iostream>
#include <vector>
#include <algorithm>
#include <queue>
using namespace std;
const int MAX = 2000; // 최대 노드 수 설정
vector<int> graph[MAX];
bool flagList[MAX];
bool flag = false;
queue<int> q;
void DFS(int index){
    if (flagList[index]) return;
    flagList[index] = true;
    cout<<index<<' ';
    sort(graph[index].begin(), graph[index].end());
    for (int i = 0; i < graph[index].size(); i++) {
        int nextIndex = graph[index][i];
        DFS(nextIndex);
    }
}
void BFS(){
    while(!q.empty()){
        int first = q.front();
        cout<<first<<' ';
        q.pop();
        sort(graph[first].begin(), graph[first].end());
        for (int i = 0; i < graph[first].size(); i++) {
            int nextIndex = graph[first][i];
            if (!flagList[nextIndex]){
                q.push(nextIndex);
                flagList[nextIndex] = true;
            }
        }
    }
}
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int V,E,start;
    cin>>V>>E>>start;
    for (int i=0; i<E; i++){
        int a,b;
        cin>>a>>b;
        graph[a].push_back(b);
        graph[b].push_back(a);
    }
    for (int i=1; i<=V; i++){
        flagList[i] = false;
    }
    DFS(start);
    cout<<'\n';
    for (int i=1; i<=V; i++){
        flagList[i] = false;
    }
    q.push(start);
    flagList[start] = true;
    BFS();
    return 0;
}