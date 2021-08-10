#include <bits/stdc++.h>
using namespace std;
 
#define IOS ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
#define endl "\n"
#define int long long
 
const int N=1e5+5;
 
int n, k;
int a[N], cache[N];
 
int dp(int idx)
{
	if(idx>n)
		return 1e10;
	if(idx==n)
		return 0;
	int &ans=cache[idx];
	if(ans!=-1)
		return ans;
	ans=1e10;
	for(int i=1;i<=k && i+idx<=n;i++)
		ans=min(ans, abs(a[idx]-a[idx+i])+dp(idx+i));
	return ans;
}
 
int32_t main()
{
	IOS;
	memset(cache, -1, sizeof(cache));
	cin>>n>>k;
	for(int i=1;i<=n;i++)
		cin>>a[i];
	int ans=dp(1);
	cout<<ans;
	return 0;
}
