#include<iostream>
using namespace std;
int main()
{
  int n,a[16],sum1=0,sum2=0;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }

  for(int i=0;i<n;i++)
  {
    
  if(a[i]%2==0)
      sum1=sum1+a[i];
    else
      sum2=sum2+a[i];
  }
  cout<<"The sum of the even numbers in the array is "<<sum1<<"\n";
  cout<<"The sum of the odd numbers in the array is "<<sum2;
}