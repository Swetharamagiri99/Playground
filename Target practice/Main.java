#include <iostream>
using namespace std;
int main(void)
{
int t, s, a=0, sum=0;
cin>>t;
while(sum<t)
{
cin>>s;
sum=sum+s;
a++;
}
cout<<"The number of turns is "<<a<<"\n";
}