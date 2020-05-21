#include<iostream>
#include<cstring>

using namespace std;
int main()
{
  //Type your code here.
  int i,j,temp;
  char word[50],rw[50];
  std::cin>>word;
  std::cin>>rw;
  int c=strlen(word);
  for(i=0;i<c/2;i++)
  { swap(word[i],word[c-i-1]);
}
  if(strcmp(word,rw) == 0)
  cout<<"It is correct";
  else
    cout<<"It is wrong";

}