#include<iostream>
using namespace std;
int main()
{
  int r,c,a[10][10],maxi;
  cin>>r;
  cin>>c;
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      cin>>a[i][j];
      if(a[i][j]>maxi)
        maxi=a[i][j];
    }
  }
  
  cout<<"The maximum element is "<<maxi;


}