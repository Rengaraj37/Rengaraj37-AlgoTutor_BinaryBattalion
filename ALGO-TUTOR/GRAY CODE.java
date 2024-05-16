import java.util.*;
public class GC
{
  public static void main(String[] args)
  {
  Scanner s=new Scanner(System.in);
  int n=s.nextln();
  List<Integer>list=new ArrayList<>();
  for(int i=0;i<(1<<n);i++)
  {
  list.add(i^(i>>1));
  }
  System.out.println(list);
  }
}


  
