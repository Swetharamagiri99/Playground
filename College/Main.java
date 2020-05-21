#include<iostream>
#include<string.h>
using namespace std;
struct College {
  char name[100];
  char city[100]; 
  int year;
  float passper;
} c[100];
int main()
{
  int n;
  cout<<"Enter the number of colleges\n";
  cin>>n;
  for(int i=1;i<=n;i++){
  cout<<"Enter the details of college "<<i<<endl;
   cout<<"Enter name\n";
    cin>>c[i].name;
    cout<<"Enter city\n";
    cin>>c[i].city;
    cout<<"Enter year of establishment\n";
    cin>>c[i].year;
    cout<<"Enter pass percentage\n";
    cin>>c[i].passper;
  }
  

  cout<<"Details of colleges\n";
  for(int i=1;i<=n;i++)
 {
    cout<<"College:"<<i<<endl;
    cout<<"Name:"<<c[i].name<<endl;
    cout<<"City:"<<c[i].city<<endl;
    cout<<"Year of establishment:"<<c[i].year<<endl;
      cout<<"Pass percentage:"<<c[i].passper<<endl;
  }











}