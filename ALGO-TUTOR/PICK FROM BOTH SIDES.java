import java.util.*;

public class Main3
{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int B=sc.nextInt();
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < B; i++) {
            sum += arr[i];
        }
        maxSum = sum;
        
       
        for (int i = 1; i <= B; i++) {
            sum -= arr[B - i];
            sum += arr[n - i];
            maxSum = Math.max(maxSum, sum);
        }
    System.out.print(maxSum);

    }
}
