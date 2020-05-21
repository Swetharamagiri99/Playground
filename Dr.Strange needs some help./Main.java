#include<iostream>
using namespace std;
int main()
{
  int m,n,req,k;
  cin>>m;
  cin>>n;
  cin>>req;
  k=m;
  for(int i=1;i<n;i++)
    m=k*m;
 // cout<<m;
  if(m>=req)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}

