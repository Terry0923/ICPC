#include <iostream>
#include <string>
using namespace std;

int main() {
  int x, y, z;
  cin >> x;
  cin >> y;
  cin >> z;

  string a;
  for (int i = 1; i <= z; i++){
    a = "";
    if (i%x==0)
    a+="Fizz";
    if (i%y==0)
    a+="Buzz";
    if(a.length()==0) {
    cout << i << endl;
    continue;
    }
    cout<<a<<endl;
  }

  return 0;
}
