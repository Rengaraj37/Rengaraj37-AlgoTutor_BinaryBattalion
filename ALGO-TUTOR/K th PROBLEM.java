public class Main{
    public static void main(String args[])
    {
        int a=2,b=2;
        System.out.print(Kth(a,b));
    }
    public static int Kth(int num, int k)
    {
        if(num==1 && k==1)
        {
            return 0;
        }
        int cen = (int)(Math.pow(2,num-1)/2);
        if(k<=cen)
        {
            return Kth(num-1,k);
        }
        else
        {
            return(Kth(num-1,k-cen)==1) ? 0 : 1;
        }
    }
}
