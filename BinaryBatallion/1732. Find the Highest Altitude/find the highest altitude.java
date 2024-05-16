class Solution {
    public int largestAltitude(int[] gain) {
        int r = gain.length;
        int sum = 0;
        int max = 0;  
        for(int i=0; i<r; i++)
        {
            sum += gain[i];
            max = Math.max(max,sum); 
        }
        return max;
    }
}
