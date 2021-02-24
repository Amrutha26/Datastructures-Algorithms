//https://practice.geeksforgeeks.org/problems/permutations-of-a-given-string2041/1/?category[]=Recursion&category[]=Recursion&difficulty[]=-1&page=1&query=category[]Recursiondifficulty[]-1page1category[]Recursion

#include<bits/stdc++.h>
using namespace std;

class Solution {
  
     public:
        void helper(vector<string> &t, string a, int l, int r) {
            if(l==r) {
                t.push_back(a);
            } else {
                for(int i=l; i<=r; i++) {

                    //Swapping
                    swap(a[l], a[i]);

                    //Recursion
                    helper(t,a,l+1,r);

                    //Backtrack
                    swap(a[l], a[i]);
                }
            }
        }

        vector<string>find_permutation(string S) {
            vector<string> t;
            helper(t,S,0,S.length()-1);
            sort(t.begin(),t.end());
            return t;
        }
};

int main() {
    int t;
    cin >> t;
    while(t--) {
        string S;
        cin >> S;
        Solution ob;
        vector<string> ans = ob.find_permutation(S);
        for(auto i: ans) {
            cout << i << " ";
        }
        cout << "\n";
    }
    return 0;
}