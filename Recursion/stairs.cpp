//https://www.hackerrank.com/challenges/ctci-recursive-staircase/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=recursion-backtracking


//pseudocode
int stepPerms(int n) {
 if(n<0) {
     return 0;
 } else if(n==0) {
     return 1;
 } else {
     return stepPerms(n-1) + stepPerms(n-2) + stepPerms(n-3);
 }

}