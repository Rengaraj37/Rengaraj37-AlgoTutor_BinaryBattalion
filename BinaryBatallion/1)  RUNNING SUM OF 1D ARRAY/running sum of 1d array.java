class Solution {
    public int[] runningSum(int[] nums) {
        int r = nums.length;
        int sum = 0;
        for(int i=0; i<r; i++)
        {
            sum = sum + nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
