#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a[20],l,v,result[20];
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  cout<<"Enter the elements in the array"<<endl;
  for(int i=0;i<n;i++)
    cin>>a[i];
  cout<<"Enter the location where you wish to insert an element"<<endl;
  cin>>l;
   if(l>n)
    cout<<"Invalid Input";
  else{
  cout<<"Enter the value to insert"<<endl;
  cin>>v;
  cout<<"Array after insertion is"<<endl;
   for(int i = 0; i < l-1; i++)
        result[i] = a[i];
    result[l-1] = v;
    for(int i = l ; i < n+1; i++)
        result[i] = a[i - 1];
   for(int i=0;i<n+1;i++)
         cout<<result[i]<<endl;
  }
}