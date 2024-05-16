import java.util.*;

public class Main5
{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if(i>max)
            max=i;
        }
        int time = 0;
        for (int i : arr) {
            time += max - i;
        }
        System.out.print(time);

    }
}
