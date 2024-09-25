## [QUESTION I](https://www.geeksforgeeks.org/problems/sorting-employees5907/1)
You are given two arrays, employee and salary, where employee[i] denotes the name of the ith employee, and salary[i] denotes the salary of the ith employee. Your task is to sort the employee array based on their salaries in non-decreasing order. If two or more employees have the same salary, sort them alphabetically by their names. Return the sorted employee array.

### Examples:
```
Input:
employee = ["chef", "geek"], salary = [100, 50]  
Output:
["geek", "chef"]  
Explanation:
"geek" has a lower salary (50) than "chef" (100), so "geek" comes first.
```  

```
Input: 
employee = ["ram", "shyam", "rohan"], salary = [60, 45, 60]  
Output: 
["shyam", "ram", "rohan"]  
Explanation:
"shyam" has the lowest salary (45), so "shyam" comes first, followed by "ram" and "rohan," who both have the same salary (60). They keep their original order.
 ``` 

**Expected Time Complexity:** O(nlogn).  
**Expected Space Complexity:** O(n).  

Constraints:  
`1 ≤ employee.size() = salary.size() ≤ 10^5`  
`1 ≤ salary[i] ≤ 10^6`  
employee[i] contains only lowercase alphabetic characters

---
## [QUESTION II](https://www.geeksforgeeks.org/problems/selection-sort/1 ) 
Given an unsorted array of size N, use selection sort to sort arr[] in increasing order.


### Example 1:
```
Input:
N = 5  
arr[] = {4, 1, 3, 9, 7}  
Output:
1 3 4 7 9
Explanation:
Maintain sorted (in bold) and unsorted subarrays.
Select 1. Array becomes 1 4 3 9 7.
Select 3. Array becomes 1 3 4 9 7.
Select 4. Array becomes 1 3 4 9 7.
Select 7. Array becomes 1 3 4 7 9.
Select 9. Array becomes 1 3 4 7 9.
```
## Example 2:
```
Input:
N = 10
arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
Output:
1 2 3 4 5 6 7 8 9 10
```
## Your Task:  
You dont need to read input or print anything. Complete the functions select() and selectionSort() ,where select() takes arr[] and starting point of unsorted array i as input parameters and returns the selected element for each iteration in selection sort, and selectionSort() takes the array and it's size and sorts the array.


`Expected Time Complexity: O(N2)`
`Expected Auxiliary Space: O(1)`

Constraints:
`1 ≤ N ≤ 10^3`