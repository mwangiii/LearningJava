//{ Driver Code Starts
import java.util.*;
import java.lang.Math;

class Sorting
{
	
	static void printArray(int arr[],int size)
	{
		int i;
		for(i=0;i<size;i++)
		System.out.print(arr[i]+" ");
	    System.out.println();
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
		
			for(int i=0;i<n;i++)
			a[i]= sc.nextInt();
			
			 new Solution().insertionSort(a,n);
			 printArray(a,n);
			
		t--;
		}
		
	}
}
// } Driver Code Ends
class Solution
{
  static void insert(int arr[],int i) {
      // Assumes the first index is the sorted array
      // Iteration starts at the second index
      // Compares the second index with the first index
      // if it's less than first index value swap them else inabaki hivyo
      // Increments to the third index, then compares itself with the second and the first indexes
      
      // Iterate over the array using i as the iterator
      // [12, 45, 78, 2, 90, 65] - array
      //  0, 1, 2, 3, 4, 5, 6 - indexes
      
      // insert(array, 4)
      
      int key = arr[i]; // 2
      int j = i - 1; // 78
      
      while (j >= 0 && arr[j] > key) {
          arr[j + 1] = arr[j];
          j--;
      }
      
      arr[j + 1] = key;
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
      // call insert function
      for (int i = 1; i < n; i++) {
          insert(arr, i);
      }
  }
}