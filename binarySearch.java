public class binarySearch {
      public static void main(String[] args){
        int [] arr = {1,4,5,7,8,9,12,13,14,16,18,19};
        int ans = binaryArr (arr,2);
       System.out.println(ans);
      }

      static int binaryArr (int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
          int mid = start + (end - start)/2;
          if (target == arr[mid]) return mid;
          if (target > arr[mid] ) {
            //we are searching on the right
            start = mid + 1;
          } else {
          //we are searching on the left
            end = mid - 1;
          }
        }
      return -1;
      }  
}
