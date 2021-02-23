//https://practice.geeksforgeeks.org/problems/number-of-paths0926/1

#include <bits/stdc++.h>
using namespace std;
 
long long  numberOfPaths(int m, int n)
{
   
    if(m == 1 || n == 1) {
        return 1;
    } else {
        return numberOfPaths(m-1,n) + numberOfPaths(m,n-1);
    }
}

int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n,m;
		cin>>m>>n;
	    cout << numberOfPaths(m, n)<<endl;
	}
    return 0;
}  