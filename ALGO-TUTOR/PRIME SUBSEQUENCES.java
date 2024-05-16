import java.util.*;
import java.lang.*;
public class Main
{
    private static List<List<Integer>> ans;
    public static void main(String[] args)
    {
       ans=new ArrayList<>();
       ArrayList<Integer> list=new ArrayList<>();
       int arr[]={1,2,3};
       int i=0;
       subSequence(arr,i,list);
       int max=0,count=0;
       for(int j=0;j<arr.length;j++)
       {
          if(max<arr[j])
          {
             max=arr[j];
          }
       }
       List<Integer> list1=new ArrayList<>();
       for(int j=2;j<=max;j++)
	   {
          int c=0;
          for (int k = 1; k <= max; k++)
	      {
            if (j % k == 0)
            {
              c++;
            }
          }
          if(c==2)
	      {
	       list1.add(j);
	      } 
      }
      ans.remove(ans.indexOf(ans.get(0)));
      for(int j=0;j<ans.size();j++)
      {
        int cnt=0;
        int l=ans.get(j).size();
        for(int k=0;k<l;k++)
        {
          int c=0,b=ans.get(j).get(k);
          for(int p:list1)
          {
             if(b==p)
			 {
               cnt++;
             }
          }
        }
        if(cnt==l)
        {
          count++;
        }
      }
       System.out.println(count);
    }
    private static void subSequence(int[] arr,int i,ArrayList<Integer> list)
    {
     if(i==arr.length)
	 {
	    ans.add(new ArrayList<>(list));
	 }
     else
	 {
        subSequence(arr,i+1,list);
        list.add(arr[i]);
        subSequence(arr,i+1,list);
        list.remove(list.size()-1);
     }
    }
}
