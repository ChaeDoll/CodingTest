// 문제024 - 신기한 소수 찾기 (백준 11724 [골드5])
#include <iostream>
using namespace std;

bool isPrime(int num){
    bool flag = true;
	for (int i=2; i<= num/2; i++){
		if (num%i==0){
		    flag = false;
		    break;
		}
	}
	return flag;
}
void findPrime(int num, int maxDigit){
	if (maxDigit==0) return;
	num = num*10;
	for (int i=1; i<10; i+=2){
		if(isPrime(num+i)){
		    if (maxDigit==1){
			    cout<<num+i<<'\n';
		    }
			findPrime(num+i, maxDigit-1);
		}
	}
}
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
	int maxDigit;
	cin>>maxDigit;
	if (maxDigit==1){
	    cout<<2<<'\n'<<3<<'\n'<<5<<'\n'<<7;
	} else {
		findPrime(2, maxDigit-1);
		findPrime(3, maxDigit-1);
		findPrime(5, maxDigit-1);
		findPrime(7, maxDigit-1);	
	}
    return 0;
}