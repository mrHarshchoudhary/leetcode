class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        for (int i = 0; i < boxTypes.length - 1; i++) {
    for (int j = 0; j < boxTypes.length - i - 1; j++) {
        if (boxTypes[j][1] < boxTypes[j + 1][1]) {
            int[] temp = boxTypes[j];
            boxTypes[j] = boxTypes[j + 1];
            boxTypes[j + 1] = temp;
        }
    }
}
int totalUnits = 0;
      for(int []box:boxTypes){
int count=Math.min(truckSize,box[0]);
 totalUnits+=count*box[1];
 truckSize-=count;
      }
      return totalUnits;
    }
}