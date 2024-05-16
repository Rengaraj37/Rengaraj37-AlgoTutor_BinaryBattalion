class Solution {
    public int findMiddleIndex(int[] nums) {
        int r = nums.length;
        for(int i=0; i<r; i++)
        {
            int ls = 0;
            int rs = 0;
            for(int j=0; j<i; j++)
            {
                ls += nums[j];
            }
            for(int j=i+1; j<r; j++)
            {
                rs += nums[j];
            }
            if(ls == rs)
            {
                return i;
            }
        }
        return -1;
    }
}
