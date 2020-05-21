#include <iostream>
using namespace std;
int main() {
    // Type your code here
  int n;
  std::cin>>n;
  for(int i=0;i<n;i++){
	for(int j=0;j<n;j++){
      if(i%2!=0){
        if(j!=0)
        cout<<i+1;
  		 else if(j==0)
      cout<<i+2;
      }
      if(i%2==0){
        if(j!=n-1)
        cout<<i+1;
   else if(j==n-1)
      cout<<i+2;
      }
  }
    cout<<endl;
}
    return 0;
}