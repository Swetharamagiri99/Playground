#include<iostream>
using namespace std;
int main()
{
  int r,c,a[10][10],maxm;
  cin>>r;
  cin>>c;
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      cin>>a[i][j];
  for (int i = 0; i < c; i++) { 
        int maxm = a[0][i]; 
        for (int j = 1; j < r; j++) { 
            if (a[j][i] > maxm) 
                maxm = a[j][i]; 
        }
        cout << maxm << endl; 
    } 
  
}