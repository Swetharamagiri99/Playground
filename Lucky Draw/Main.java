#include <iostream>  
using namespace std;  
int main()  
{  
  int n, i, m=0, count=0;  
 // cout << "Enter the Number to check Prime: ";  
  cin >> n;  
  //m=n/2;  
  for(i =1 ; i <= n; i++)  
  {  
      if(n % i == 0)  
      {  
         // cout<<"Not eligible"<<endl;  
          count++; 
         
      }  
  }  
  if (count==2)  
      cout << "Eligible"<<endl;
  else 
   cout<<"Not eligible"<<endl;
   

}  
