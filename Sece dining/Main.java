#include<iostream>
#include <string> 
using namespace std;
int main()
{
  //Type your code here.
  string str,rear,front;
  int rail,n=1;
  std::cin>>str;
  std::cin>>rail;
  if(rail==1 )
  {
    if(str=="front")
    {
    std::cout<<"Left Handed";
    }
    else
    {
          std::cout<<"Right Handed";
    }
  }
 else 
 {
   if(str=="front")
   {   
     std::cout<<"Right Handed";
   }
   else
   {
      std::cout<<"Left Handed";
   }
 }

 
}