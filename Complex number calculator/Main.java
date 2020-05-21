#include <iostream>
using namespace std;
class complex
{
     public: int real, img;
};
int main()
{
   complex a, b, c;
  int ch;
  cin>>ch;
   cin >> a.real;
  cin >> a.img;
   cin >> b.real;
   cin >> b.img;
  if(ch==1){
   c.real = a.real + b.real;
   c.img = a.img + b.img;
    if (c.img >= 0)
      cout << c.real << "+" << c.img << "i";
   else
      cout << c.real << "" << c.img << "i";
  }
  else if(ch==2){
     c.real = a.real -b.real;
   c.img = a.img - b.img;
    if (c.img >= 0)
      cout << c.real << "+" << c.img << "i";
   else
      cout  << c.real << "" << c.img << "i";
  }
   else if(ch==3){
     c.real = a.real *b.real-a.img*b.img;
   c.img = a.img * b.img+a.real*b.img;
    if (c.img >= 0)
      cout << c.real << "+" << c.img << "i";
   else
      cout  << c.real << "" << c.img << "i";
   }
  else
    cout<<"Invalid choice";
   return 0;
}

