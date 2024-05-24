
public class MaxMinNumber {
	
	public static void findMaxNumber(int a, int b, int c)
	{
		int max=0;
		while(a>0 || b>0||c>0)
		{
			a--;
			b--;
			c--;
			max++;
		}
		System.out.print(max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findMaxNumber(10,78,80);

	}


}
