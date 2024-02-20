/*
 Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4]
 */

class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            // see line 8 for better understanding of iteration.
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }
}