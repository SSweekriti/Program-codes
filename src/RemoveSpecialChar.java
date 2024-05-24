
public class RemoveSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Macbook@#%&$^!@<>:(&&%&";
		System.out.print(s.replaceAll("[^0-9,A-Z,a-z]"," "));

	}

}
