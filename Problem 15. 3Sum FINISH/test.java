import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += i;
            if(sum == 0 && nums[i] == nums[nums.length - 1]){
                return threeSum(nums);
            }   
        }
        return threeSum(nums);
    }



public static void main(String [] args){
    Solution s = new Solution();
    int[] stuff = {-1, 0, 1};
    s.threeSum(stuff);
}
}