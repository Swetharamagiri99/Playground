#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,a[10],high=0;
  cin>>n;
  for(int i=0;i<n;i++){
    cin>>a[i];
  if(high<a[i])
    high=a[i];
  }
  cout<<high;
  
}