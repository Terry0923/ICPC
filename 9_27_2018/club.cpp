
#include <iostream>
#include <string>
#include <cmath>
using namespace std;

void clubSwap(string&, int);

void clubSwap(string& s, int x) {
  char temp = s[x];
  s[x] = s[x+1];
  s[x+1] = temp;
}

void solve(string s, int x){
  int diff = 0;
  for(int i = 0; i < s.length(); i++){
    if(s[i] == 'M') {
      diff++;
    }
    else {
      diff--;
    }

    if(abs(diff) > x){
      if(s[i] == 'M' && s[i + 1] == 'W') {
        diff -= 2;
        clubSwap(s, i);
      }
      else if (s[i] == 'W' && s[i + 1] == 'M'){
        diff += 2;
        clubSwap(s, i);
      }
      else {
        cout << i << endl;
        break;
      }
    }
    
    if (i == s.length() - 1)
      cout << s.length() << endl;

  }
}

int main() {

  int x;
  string s;
  cin >> x;
  cin >> s;

  solve(s, x);

  return 0;
}
