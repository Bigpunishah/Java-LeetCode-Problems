/*
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.



Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
!It does not matter what you leave beyond the returned k (hence they are underscores).
 */


 class Solution {
    public int removeElement(int[] nums, int val) {

        //the value to change all non equal values
        int k = 0;


        for(int i = 0; i < nums.length; i++){

            //if the nums[i] != val...
            if(nums[i] != val){

                //k index of nums is taking the value of nums i which should be the same since the if statment checks.
                nums[k] = nums[i];

                //increment k
                k++;
            
            }
        }
        return k;
        
    }
}