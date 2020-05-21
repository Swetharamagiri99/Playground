#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,a[10],m,pass=0;
  cin>>n;
  for(int i=0;i<n;i++)
    cin>>a[i];
  cin>>m;
    for(int i=0;i<n;i++)
    {
	if(m==a[i]){
      pass=1;
      break;}
    }
  if(pass==1)
    cout<<"She passed her exam";
  else
    cout<<"She failed";



}