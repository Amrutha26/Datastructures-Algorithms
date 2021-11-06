class Solution {
  public int[] singleNumber(int[] nums) {
    // difference between two numbers (x and y) which were seen only once
    int mask = 0;
    for (int i : nums) mask ^= i;

    // rightmost 1-bit diff between x and y
    int diff = mask & (-mask);

    int x = 0;
    // bitmask which will contain only x
    for (int i : nums) {
        if ((i & diff) != 0) x ^= i;
    }
        

    return new int[]{x, mask^x};
  }
}
