import java.util.Arrays;
import java.util.List;

public class PrintEvenNumbersFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l = Arrays.asList(10,9,8,7,6,5,3,4,2);	
		l.stream()
		             .filter(e -> e%2==0)
		                                  .forEach(System.out::println);
		

	}

}
