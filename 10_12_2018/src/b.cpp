#include <iostream>
using namespace std;

int sum(int n, int b) {
  int s = 0;
  while(n>0) {
    s+=n%b;
    n/=b;
  }
  return s;
}

int main() {

  long n;
  int a, b;
  cin >> n;
  cin >> a;
  cin >> b;

  while(true) {
    n++;
    if((n%a==0||n%b==0)&&(sum(n,a) == sum(n, b))) {
        cout << n;
        break;
    }
  }

  return 0;
}
