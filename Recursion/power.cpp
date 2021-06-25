class Solution {
public:
    double myPow(double x, int n) {
        double ans=1;
        while(n!=0){
            if(n%2!=0){
                if(n>0)
                   ans=ans*x;
                else
                    ans=ans/x;
            }
            n=n/2;
            x=x*x;
        }
        return ans;
    }
};
