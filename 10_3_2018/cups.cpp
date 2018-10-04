#include <iostream>
#include<string>
using namespace std;

int main() {
int i;
cin>>i;
int intArray[i];
string stringArray[i];
string stringInput[i];

for(int k=0;k<i;k++) {
cin>>stringInput[k];
if(isdigit(stringInput[k].at(0))){
  int count=0;
  while(isdigit(stringInput[k].at(count))) {
    count++;
  }
  string newIntString = stringInput[k].substr(0,count);
intArray[k] = stoi(newIntString);
  stringArray[k]= stringInput[k].substr(count++);
}
else{
int count=0;
while(!isdigit(stringInput[k].at(count)))
count++;
string newString = stringInput[k].substr(0,count);
stringArray[k]= newString;
intArray[k]= stoi(stringInput[k].substr(count++));
}



}

  return 0;
}
