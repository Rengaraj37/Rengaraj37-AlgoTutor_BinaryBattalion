class Solution {
    public int[] leftRightDifference(int[] nums) {
        int r = nums.length;
        int [] s = new int[r];
        int sum = 0;
        int ls = 0;
        for(int i=0; i<r; i++)
        {
            sum += nums[i];
        }
        for(int i=0; i<r; i++)
        {
            int rs = sum-ls-nums[i];
            s[i] = Math.abs(rs - ls);
            ls += nums[i];
        }
         return s;
    }
}
