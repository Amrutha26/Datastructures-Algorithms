#include<bits/stdc++.h>
using namespace std;
#define int long long 
int n, a[100005]; 
int dp[100005]; 
 
int func(int ind) {
	if(ind==(n-1)) return 0; 
	if(ind>=n) return INT_MAX; 
 
	if(dp[ind]!=-1) return dp[ind]; 
    
	int left = abs(a[ind]-a[ind+1]) + func(ind+1); 
	int right = INT_MAX; 
	if(ind+2<n) {
		right = abs(a[ind] - a[ind+2]) + func(ind+2); 
	}
 
	return dp[ind] = min(left, right); 
}
signed main() {
	
	cin >> n;
 
	memset(dp, -1, sizeof dp); 
	
	for(int i = 0;i<n;i++) {
		cin >> a[i]; 
	}
 
	cout << func(0); 
}
