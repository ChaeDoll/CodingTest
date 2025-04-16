// 문제025 - 친구 관계 파악하기 (백준 13023 [골드5])
#include <iostream>
#include <vector>
using namespace std;
const int MAX = 2000; // 최대 노드 수 설정
vector<int> graph[MAX];
bool flagList[MAX];
bool flag = false;

void DFS(int index, int depth){
    if (depth==5){
        flag = true;
        return;
    }
    flagList[index] = true;
    for (int i = 0; i < graph[index].size(); i++) {
        int nextIndex = graph[index][i];
        if (flagList[nextIndex]==false){
            DFS(nextIndex, depth+1);
        }
    }
    flagList[index] = false;
}
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int V,E;
    cin>>V>>E;
    for (int i=0; i<E; i++){
        int a,b;
        cin>>a>>b;
        graph[a].push_back(b);
        graph[b].push_back(a);
    }
    for (int i=0; i<V; i++){
        flagList[i] = false;
    }
    for (int i = 0; i < V; i++) {
        if(flagList[i]==false){
            DFS(i, 1);
        }
    }
    if (flag){
        cout<<'1';
    } else{
        cout<<'0';
    }
    return 0;
}