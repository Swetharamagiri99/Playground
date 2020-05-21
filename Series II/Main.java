#include<iostream>
#include<math.h>
int main()
{
  int n,s=11;
  std::cin>>n;
  for(int i=0;i<n;i++)
  {
    std::cout<<pow(s,2)<<" ";
    s=s+4;
}
}