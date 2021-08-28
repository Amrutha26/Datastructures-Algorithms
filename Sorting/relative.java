class Solution {
public int[] relativeSortArray(int[] arr1, int[] arr2) {

    int[] array1 = new int[1002];
    int[] ans = new int[arr1.length];

    // counting the no of occurrences
    for(int i=0; i<arr1.length; i++) {
        array1[arr1[i]]++;
    }

    int j = 0;

    // relative sorting arr2
    for(int i=0; i<arr2.length; i++) {
        while(array1[arr2[i]] > 0) {
            ans[j++] = arr2[i];
            array1[arr2[i]]--;
        }
    }

    // adding the rest of arr1 elements
    for(int i=0; i<array1.length; i++) {
        while(array1[i] > 0) {
            ans[j++] = i;
            array1[i]--;
        }
    }

    return ans;
}


}
