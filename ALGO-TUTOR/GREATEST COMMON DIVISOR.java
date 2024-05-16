public class Main
{
	public static void main(String[] args) 
	{
		int R=7,S=6;
		System.out.println(gcd(R,S));
	}
	private static int gcd(int R,int S)
	{
	if(S==0)
		return R;
	return gcd(S,R%S);
	}
}
