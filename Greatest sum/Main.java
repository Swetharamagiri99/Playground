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
  cout<<"Sum of rows is ";
   for(int i=0;i<r;i++){
    max1=0;
    for(int j=0;j<c;j++){
      max1=max1+a[i][j];
    }
     cout<<max1<<" ";
     if(max1>mac){
       mac=max1;
       d=i+1;}
  }
  cout<<"\nRow "<<d<<" has maximum sum";

 cout<<endl;
  cout<<"Sum of columns is ";
  for(int i=0;i<c;i++){
    maxi=0;
    for(int j=0;j<r;j++){
      maxi=maxi+a[j][i];
    }
    cout<<maxi<<" ";
    if(maxi>mac1){
      mac1=maxi;
       e=i+1;
    }
  
  }
  cout<<"\nColumn "<<e<<" has maximum sum";
  
}