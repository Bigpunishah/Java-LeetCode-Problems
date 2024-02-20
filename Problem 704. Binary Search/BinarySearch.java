
/*
 Given an array of integers nums which is sorted in ascending order, 
 and an integer target, write a function to search target in nums. 
 If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

 */

// this would be a linear search
//checking each value in the for loop.

class Solution {
    public int search(int[] nums, int target) {

        // iterate through the length of array
        for (int i = 0; i < nums.length; i++) {

            // condition
            if (nums[i] == target) {

                // looking for the index value so return i
                return i;
            }
        }

        // if not found return -1
        return -1;
    }
}

// Faster solution
// using the mid as a point of referance
class Solution2 {
    public int search(int[] nums, int target) {

        // left is left is lowest val in array
        int left = 0;

        // right is max val in array.
        // -1 gives the right num
        int right = nums.length - 1;

        while (left <= right) {

            // mid is somehow this lol
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // updating the code if not found yet
            else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}