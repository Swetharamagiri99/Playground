#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,s,a[11],sum;
  cin>>n>>s;
  for(int i=0;i<n;i++){
    cin>>a[i];
  sum+=a[i];
  }
  if(sum>=4)
  std::cout<<"NO";
  else
    cout<<"YES";
}