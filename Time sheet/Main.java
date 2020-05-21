#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d,e,f,g,s=0;
  cin>>a;
  cin>>b;
  cin>>c;
  cin>>d;
  cin>>e;
  cin>>f;
  cin>>g;
  if(a>0)
    s=s+(a*150);
  if(b>=8)
    s+=(b-8)*15;
  if(c>=8)
    s+=(c-8)*15;
  if(d>=8)
    s+=(d-8)*15;
  if(e>=8)
    s+=(e-8)*15;
  if(f>=8)
    s+=(f-8)*15;
  if(g>0)
    s+=g*125;
  s+=(b+c+d+e+f)*100;
  cout<<s;
}