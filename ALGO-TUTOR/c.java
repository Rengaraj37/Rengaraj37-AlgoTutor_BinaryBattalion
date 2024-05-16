import java.util.*;
public class Main
{
     public static void main(String[] args)
	 {
	    Scanner s=new Scanner(System.in);
	    int a=s.nextInt();
	    int b=s.nextInt();
	    int c=s.nextInt();
        int a_fact=factorial(a);
        int b_fact=factorial(b);
        int a_b_fact=factorial(a-b);
        System.out.println(((int)a_fact/(a_b_fact*b_fact))%c);
     }
     private static int factorial(int a)
     {
        if(a==1)
        {
          return 1;
        }
        return a*factorial(a-1);
     }
}
