import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Integer> number = List.of(18,6,4,15,55,78,12,9,8);
		
		long numeros = number.stream()
		.filter(n -> n > 10).count();
		
		System.out.println(numeros);
		
	}

}
