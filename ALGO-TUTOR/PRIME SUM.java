public class Main 
{
   public static void main(String[] args)
   {
      int n=9;
      int[] check=new int[n+1];
      int ans[]=new int[2];
      check[0]=0;
      check[1]=0;
      for(int i=2;i<=n;i++)
      {
         check[i]=1;
      }
      for(int i=2;i*i<=n;i++)
      {
         if(check[i]==1)
         {
           for(int j=i*i;j<=n;j+=i)
           {
              check[j]=0;
           }
         }
      }
      for(int i=0;i<n;i++)
      {
         if(check[i]==check[n-i]) 
		 {
            ans[0]=i;
            ans[1]=n-i;
         }
      }
      for(int i:ans)
      {
        System.out.print(i+" ");

      }

    }
}
