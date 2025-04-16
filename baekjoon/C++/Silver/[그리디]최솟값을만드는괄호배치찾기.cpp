// 문제036 - 최솟값을 만드는 괄호 배치 찾기 (백준 1541 [실버2])
#include <iostream>
#include <vector>
#include <regex>
#include <string>
using namespace std;

vector<string> split(const string& str, const string& regex_str){
    vector<std::string> tokens;
    regex re(regex_str);
    sregex_token_iterator it(str.begin(), str.end(), re, -1);
    sregex_token_iterator reg_end;
    for ( ; it != reg_end; ++it) {
        if (!it->str().empty()) { // 공백 문자열 무시
            tokens.push_back(*it);
        }
    }
    return tokens;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    string problem;
    cin>>problem;
    vector <string> result = split(problem, "[-]");
    long sum = 0;
    for (long i=0; i<result.size(); i++){
        vector <string> temp = split(result[i], "[+]");
        for (long j=0; j<temp.size(); j++){
            if (i==0) {
                sum += stol(temp[j]);
            } else {
                sum -= stol(temp[j]);
            }
        }
    }
    cout<<sum;
    return 0;
}