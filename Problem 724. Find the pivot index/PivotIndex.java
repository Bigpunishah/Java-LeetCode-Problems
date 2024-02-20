//If the value from half is able to meet the other half then we met the middle index.
//It does not have to be exactly half. It is just referring to the pivot point. Where one half
// is equal to the other half. NOT middle, just split at some portion.


class Solution {
    public static int pivotIndex(int[] nums) {
        int sum = 0;  // initialize the sum of all elements to zero
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];  // add each element to the sum
        }

        int leftSum = 0;  // initialize the left sum to zero

        for (int i = 0; i < nums.length; i++) {
            //nothing is being subtracted we are just checking
            //left sum is going to add more values after this is not met.
            if (leftSum == sum - leftSum - nums[i]) {  // check if we have found the pivot index
                //looking for the index NOT value at index.
                return i;
            }
            leftSum += nums[i];  // update the left sum with the current element
        }
        return -1;  // if we have not found a pivot index, return -1
    }
}