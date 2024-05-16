import java.util.*;
public class Main
{
     public static void main(String[] args)
	 {
	     Scanner s = new Scanner(System.in);
	     int n = s.nextInt();
        int ans=0;
        for(int i=1;i<=n;i++)
        {
           int count=0;
           for(int j=2;j<=n;j++)
           {
              if(i%j==0)
              {
                count++;
              }
           }
           if(count==2)
           {
              ans++;
           }
        }
        System.out.print(ans);
     }
}
