#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,a[10][10],maxi,max1,d=0,e=0,mac=0,mac1=0;
  cin>>r;
  cin>>c;
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      cin>>a[i][j];
  
   for(int i=0;i<r;i++){
    max1=0;
    for(int j=0;j<c;j++){
      max1=max1+a[i][j];
    }
     cout<<max1<<endl;
     }
}
