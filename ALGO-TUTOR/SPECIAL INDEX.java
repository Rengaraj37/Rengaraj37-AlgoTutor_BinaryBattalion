import java.util.*;

public class Main2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int totalSum = 0;
        int count = 0;
    int evenSum = 0, oddSum = 0;
    for (int i = 0; i < n; i++) {
        if (i % 2 == 0) 
            evenSum += arr[i];
        else 
            oddSum += arr[i];
    }
    
        int currEvenSum = 0, currOddSum = 0;
        for (int i = 0; i < n; i++) {
        if (i % 2 == 0) {
            if (currEvenSum + oddSum - currOddSum == currOddSum + evenSum - currEvenSum - arr[i]) 
                count++;
            currEvenSum += arr[i];
            } 
            else {
            if (currEvenSum + oddSum - currOddSum - arr[i] == currOddSum + evenSum - currEvenSum) {
                count++;
            }
            currOddSum += arr[i];
            }
    }
    
    System.out.print(count);

    }
