package practical_lab1;

public class ReverseNum {
	public int reverse(int n)
	{
		int d,r=0;
		while(n>0)
		{
			d=n%10;
			r=(r*10)+d;
			n=n/10;
		}
		return r;
	}
}
