
public class RemoveSymbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Price1 ="$,9829.00";
		String Price2 ="Rs,9829.00";
		
		System.out.println(Price1.replaceAll("[$,]", ""));
		System.out.println(Price2.replaceAll("[Rs,]", ""));
		

	}

}
