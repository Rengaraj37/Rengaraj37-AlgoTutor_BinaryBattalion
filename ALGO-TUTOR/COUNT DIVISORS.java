import java.util.*;
public class Main
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++)
      {
          arr[i]=s.nextInt();
      }
      int ans[]=new int[arr.length];
      for(int i=0;i<arr.length;i++)
      {
        int count=0;
        for(int j=1;j<=arr[i]/2;j++)
        {
           if(arr[i]%j==0)
		   {
		      count++;
		   }
	    }
        ans[i]=count+1;
      }
      for(int i:ans)
	  {
	     System.out.print(i+" ");

	  }
  }
}
