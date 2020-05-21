#include<iostream>
#include<iomanip>
using namespace std;
struct{
char name[20];
  int empid;
  int age;
  char desig[20];
  int sal;
}e;
int main()
{
  cout<<"Enter name:\n";
  cin>>e.name;
  cout<<"Enter ID:\n";
  cin>>e.empid;
  cout<<"Enter age:\n";
  cin>>e.age;
  cout<<"Enter designation:\n";
  cin>>e.desig;
  cout<<"Enter Salary:\n"; 
  cin>>e.sal;
  cout<<"Employee Details"<<endl;
  cout<<"Name of the Employee : "<<e.name<<endl;
  cout<<"ID of the Employee : "<<e.empid<<endl;
  cout<<"Age of the Employee : "<<e.age<<endl;
  cout<<"Designation of the Employee : "<<e.desig<<endl;
  cout<<"Salary of the Employee : "<<e.sal<<endl;
  
}