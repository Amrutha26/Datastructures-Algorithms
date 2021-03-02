#include <bits/stdc++.h>
using namespace std;

void TOH(int n, char source, char aux, char dest) {
    if(n==1) {
        cout << "Move Disk " << n << " from " << source << " to " << dest << endl;
        return;
    }

    TOH(n-1, source, dest, aux);
    cout << "Move Disk " << n << " from " << source << " to " << dest << endl;
    TOH(n-1, aux, source, dest);
}

int main() {
    int n;
    cout << "Enter number of disks: ";
    cin >> n;
    TOH(n,'A','B','C');

    return 0;
}