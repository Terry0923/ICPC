

#include <iostream>
#include <string>
using namespace std;

int main() {
  string first;
  string second;
  cin >> first;
  cin >> second;
  cout << first.length() >= second.length() ? "go" : "no" << endl;
  return 0;
}
