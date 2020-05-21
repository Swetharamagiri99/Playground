#include<iostream>
#include<bits/stdc++.h>
#include<string>
using namespace std;
int main()
{
  char arr[10000];
  int i,v=0,consonant=0,space=0,digits=0,symbol=0;
    cin.getline(arr,10000);
    for(i=0;i<strlen(arr);i++){
    if(arr[i]==' ')
      ++space;
  else if(arr[i]>='0' && arr[i]<='9')
    ++digits;
  else if(arr[i]=='a'||arr[i]=='A'||arr[i]=='E'||
          arr[i]=='I'||arr[i]=='O'||arr[i]=='U' || 
          arr[i]=='e' ||arr[i]=='i' ||arr[i]=='o' ||arr[i]=='u')
      ++v;
  else if((arr[i]>='a'&& arr[i]<='z') || (arr[i]>='A'&& arr[i]<='Z'))
    ++consonant;
  else 
    ++symbol;
 
  }
  cout<<"Vowels:"<<v<<endl;
  cout<<"Consonants:"<<consonant<<endl;
  cout<<"White Spaces:"<<space<<endl;
  cout<<"Digits:"<<digits<<endl;
  cout<<"Symbols:"<<symbol;
  
  
}