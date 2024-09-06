class Solution {
    public int findKthPositive(int[] arr, int k) {
        int missingCount = 0; // To track the count of missing numbers
        int currentNumber = 1; // Start from 1
        
        int i = 0; // Index to track the array
        
        // Keep going until we find the kth missing number
        while (missingCount < k) {
            if (i < arr.length && arr[i] == currentNumber) {
                // If the number is present in the array, move to the next number
                i++;
            } else {
                // If the number is missing, increment the missing count
                missingCount++;
            }

            // If we haven't reached k missing numbers, move to the next number
            if (missingCount < k) {
                currentNumber++;
            }
            
            // Ensure i is within bounds before accessing arr[i]
            if (i < arr.length) {
                System.out.println("We are now at index " + i + ", the number is " + arr[i] + "and current number is " + currentNumber + ", the missing count is " + missingCount);
            } else {
                System.out.println("We are now out of bounds, index: " + i + ", the missing count is " + missingCount);
            }
        }
        
        return currentNumber; // Return the kth missing number
    }

    // Main function for testing
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1
        int[] arr1 = {2, 3, 4, 7, 11};
        int k1 = 5;
        int result1 = solution.findKthPositive(arr1, k1);
        System.out.println("The 5th missing number is: " + result1); // Expected output: 9
        
        // Test case 2
        int[] arr2 = {1, 2, 3, 4};
        int k2 = 2;
        int result2 = solution.findKthPositive(arr2, k2);
        System.out.println("The 2nd missing number is: " + result2); // Expected output: 6
    }
}
