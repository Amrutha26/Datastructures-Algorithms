class Solution {
  public int maximumUnits(int[][] boxTypes, int truckSize) {
    Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
    int maxUnits = 0;

    for (int[] boxType: boxTypes) {
      int numberOfBoxes = boxType[0];
      int numberOfUnitsPerBox = boxType[1];

      if (truckSize >= numberOfBoxes) {
        maxUnits += (numberOfBoxes * numberOfUnitsPerBox);
        truckSize -= numberOfBoxes;
      } else {
        maxUnits += (truckSize * numberOfUnitsPerBox);
        break;
      }
    }
    return maxUnits;
  }
}
