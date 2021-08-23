class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        System.out.println(pivot);
        // if you did not find the pivot, it means array is not rotated
        if(pivot == -1) {
            //just do normal BS
            return binarySearch(nums, target, 0, nums.length-1);    
        }

        // if pivot is found, you have found 2 ascending sorted arrays
        if(nums[pivot] == target) {
            return pivot;
        }

        else if(target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot+1, nums.length-1);

    }

    private int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    private int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int mid = start + (end-start) / 2;

            //case 1
            if(mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }

            //case 2
            if(mid > 0 && arr[mid] < arr[mid-1]) {
                return mid - 1;
            }

            //case 3
            if(arr[mid] <= arr[start]) {    
                end = mid - 1;
            } else {
                  start = mid + 1;
                  }
        }

        return -1;
    }
}
