class Solution {
    public int pivotInteger(int n){
        if(n == 1){ 
            return 1;
        }
        int sum = (n*(n+1)/2);
        int r = 0;
        for(int i=0; i<=n; i++)
        {
            r += i;
            if(sum == r){
                return i;
            }
            sum -= i;
        }
        return -1;
    }
}
