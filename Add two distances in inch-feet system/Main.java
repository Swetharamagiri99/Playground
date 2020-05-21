#include<iostream>
using namespace std;
struct height{
  int feet;
  float inch;
}h1,h2;
int main()
{
  //Type your code here.
  int f;
  float i;
  cin>>h1.feet;
  cin>>h1.inch;
   cin>>h2.feet;
  cin>>h2.inch;
  i=h1.inch+h2.inch;
  f=h1.feet+h2.feet;
  if(i>12){
    i=i-12;
  f=f+1;
  }
cout<<f<<"'-"<<i<<"\"";
}