// 문제035 - 회의실 배정하기 (백준 1931 [실버1])
#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

bool cmp(pair<int, int> &a, pair<int, int> &b){
    if(a.second == b.second) return a.first < b.first;
    else return a.second < b.second;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    long N;
    cin>>N;
    vector <pair<int, int>> meetingTime;
    for (long i=0; i<N; i++){
        long start, end;
        cin>>start>>end;
        meetingTime.push_back(make_pair(start, end));
    }
    
    // 끝난 시간을 기준으로 정렬
    sort(meetingTime.begin(), meetingTime.end(), cmp);
    
    long count = 1;
    long currentTime = meetingTime[0].second;
    for (int i = 1; i < N; i++) {
        if (meetingTime[i].second >= currentTime && meetingTime[i].first >= currentTime){
            currentTime = meetingTime[i].second;
            count++;
        }
    }
    cout<<count;
    return 0;
}