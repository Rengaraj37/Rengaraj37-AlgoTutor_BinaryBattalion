class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int r = arr.length;
        int sum = 0;
        for(int i=0; i<r; i++)
        {
            int ls = i+1;
            int rs = r-i;
            int s = ls * rs;
            int oddNum = (s+1)/2;
            sum += (oddNum*arr[i]);
        }
        return sum;
    }
}
