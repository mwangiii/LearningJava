public class selectionSort {
  // is the least index available
  //The first index will be sorted after the first iteration
  // least unsorted index 
  //least val
  // [4,3,7,8,2,5,6,9]
  //place the least val at the least index
  static void selectionSorted (int[] arr){
    int size = arr.length;
    for (int i = 0; i < size -1; i++){
      int leastIndex = i;
      for (int j = i+1; j < size; j++){
        //value to compare
        if(arr[j] < arr[leastIndex]){

        }
      }
    }

  } 
  
}
