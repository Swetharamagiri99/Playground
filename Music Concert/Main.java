#include<iostream>
using namespace std;
int main(){
  // Type your code here
  
  int n,c=0,c1=0;
  cin>>n;
  int *a= (int* )malloc(n*sizeof(int));
  for(int i=0;i<n;i++){
    cin>>a[i];
    if(a[i]%2==0)
      c++;
    else
      c1++;
  }
  cout<<c1<<endl;
  cout<<c<<endl;
  return 0;
}