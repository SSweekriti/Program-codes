
public class countUprcaseLowrcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="DSGygjHZTtduyjgih";
		int UP=0;
		int LP=0;
		
		char[] ch = str1.toCharArray();
		for(char chh :ch)
		{
			if(chh>='A' && chh<='Z')
			{
				UP++;
			
			}
			else if(chh>='a'&&chh<='z')
			{
				LP++;
			
			}
			else
			{
				continue;
			}
			
		}
		System.out.println("count of UP " + UP + " and Count of LP " + LP);
	}

}
