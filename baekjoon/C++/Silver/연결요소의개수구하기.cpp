// 문제023 - 연결 요소의 개수 구하기 (백준 11724 [실버5])
#include <iostream>
#include <vector>
using namespace std;
const int MAX = 1000; // 최대 노드 수 설정
vector<int> linkedList[MAX];
bool flagList[MAX];
int V, E;
int count = 0;
void DFS(int node) {
    if (flagList[node]) return;
    flagList[node] = true;
    for (int i = 0; i < linkedList[node].size(); i++) {
        int nextNode = linkedList[node][i];
        if (!flagList[nextNode]) {
            DFS(nextNode);
        }
    }
}
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    cin >> V >> E;
    for (int i = 0; i < E; i++) {
        int u, v;
        cin >> u >> v;
        u--;
        v--;
        linkedList[u].push_back(v);
        linkedList[v].push_back(u);
    }
    for (int i = 0; i < V; i++) {
        if (!flagList[i]) {
            count++;
            DFS(i);
        }
    }
    cout << count << "\n";
    return 0;
}