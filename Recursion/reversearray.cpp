//https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/

#include <bits/stdc++.h>
using namespace std;

void reverseArray(int arr[], int start, int end) {
   if(start >=end) {
       return;
   } 

   int temp = arr[start];
   arr[start] = arr[end];
   arr[end] = temp;

   reverseArray(arr,start+1,end-1);
}

void printArray(int arr[], int n) {
    for(int i=0; i<n; i++) {
        cout << arr[i] << " ";
        cout << endl;
    }
}

int main() {
    int arr[] = {1,2,3,4,5,6};
    int n = sizeof(arr);
    
    //Print original array
    printArray(arr,n);

    reverseArray(arr,0,n-1);

    //Print reversed array
    printArray(arr,n);

    return 0;

}