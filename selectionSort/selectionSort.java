import java.util.Arrays;
public class selectionSort {
  // is the least index available
  //The first index will be sorted after the first iteration
  // least unsorted index 
  //least val
  // [4,3,7,8,2,5,6,9]
  //place the least val at the least index
    public static void main(String[] args) {
      // Test case 1: Regular unsorted array
      int[] testCase1 = {64, 25, 12, 22, 11};
      selectionSorted(testCase1);
      System.out.println(Arrays.toString(testCase1)); // Expected output: [11, 12, 22, 25, 64]
  
      // Test case 2: Already sorted array
      int[] testCase2 = {1, 2, 3, 4, 5};
      selectionSorted(testCase2);
      System.out.println(Arrays.toString(testCase2)); // Expected output: [1, 2, 3, 4, 5]
  
      // Test case 3: Array with duplicate values
      int[] testCase3 = {5, 3, 3, 1, 4};
      selectionSorted(testCase3);
      System.out.println(Arrays.toString(testCase3)); // Expected output: [1, 3, 3, 4, 5]
  
      // Test case 4: Empty array
      int[] testCase4 = {};
      selectionSorted(testCase4);
      System.out.println(Arrays.toString(testCase4)); // Expected output: []
  
      // Test case 5: Array with one element
      int[] testCase5 = {42};
      selectionSorted(testCase5);
      System.out.println(Arrays.toString(testCase5)); // Expected output: [42]
  
      // Test case 6: Array with negative values
      int[] testCase6 = {-1, -3, -2, 0, 2};
      selectionSorted(testCase6);
      System.out.println(Arrays.toString(testCase6)); // Expected output: [-3, -2, -1, 0, 2]
  
      // Test case 7: Large array
      int[] testCase7 = {100, 50, 75, 25, 0, -50, 20, 40};
      selectionSorted(testCase7);
      System.out.println(Arrays.toString(testCase7)); // Expected output: [-50, 0, 20, 25, 40, 50, 75, 100]
  }
  static void selectionSorted (int[] arr){
    int size = arr.length;
    for (int i = 0; i < size -1; i++){
      // point to the starting point
      int leastIndex = i;
      for (int j = i+1; j < size; j++){
        //looks for the smallest value
        if(arr[j] < arr[leastIndex]){
          leastIndex = j;
        }
      }
      // swapping here
      // arr[leastIndex] = arr[i]
      int temp = arr[leastIndex];
      arr[leastIndex] = arr[i];
      arr[i] = temp;
    }
  } 
  
}
