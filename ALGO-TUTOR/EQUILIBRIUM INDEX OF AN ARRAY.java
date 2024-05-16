import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i]=s.nextInt();
        }
        int sum=0;
        for(int i:arr)
        sum+=i;
        
        int left=0;
        for(int i=0;i<num;i++)
        {
            int right=sum-left-arr[i];
            if(left==right)
            {
                System.out.print(i);
                return;
            }
            left+=arr[i];
        }
        System.out.print(-1);
    }
}

