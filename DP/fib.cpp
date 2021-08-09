#include <bits/stdc++.h>
using namespace std;

int fib(int n, vector<int> &dp) {
    if(n<=1) return n;

    if(dp[n]!= -1) return dp[n];

    dp[n] = fib(n-1,dp) + fib(n-2, dp);

    return dp[n];
}


int main() {
    int n;
    cin >> n;

    //dp - 1D array
    vector <int> dp(n+1,-1);

    int ans = fib(n,dp);
    cout << ans;
}
