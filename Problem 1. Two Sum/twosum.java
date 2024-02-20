/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.





Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].


the two values within array have to equal the target
*/


//time complexity: O(n^2)
// BRUTE FORCE
class Solution {

    // going to retrun a int
    public int[] twoSum(int[] nums, int target) {

        // while we iterate through the length
        for (int i = 0; i < nums.length; i++) {

            //another loop to check each value with the rest
            for (int j = i + 1; j < nums.length; j++) {

                //condition statement
                if (nums[i] + nums[j] == target) {

                    //going to return those values
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}


