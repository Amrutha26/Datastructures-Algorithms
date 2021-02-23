//https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1/?category[]=Recursion#



#include <bits/stdc++.h>
using namespace std;

void printNos(int N);
int main()
{
    int T;
    cin>>T;
    while(T--)
    {
        int N;
        cin>>N;
        printNos(N);
        cout << '\n'; 
        
    }
    return 0;
}




void printNos(int N)
{
    
    if(N > 0) {
        
        printNos(N-1);
        cout << N << " "; 
        
    }
    
    return;
  
}