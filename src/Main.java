import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> eh = new ArrayList<String>();
		int ah[] = {1,2,3,4,5};
		for (int i = 0; i < 10; i++) {
			eh.add(i + "");
		}
		System.out.println(eh.stream().anyMatch(n -> (n.equals("5"))));
		System.out.println(eh);
		System.out.println(IntStream.of(ah).anyMatch(n -> (n == 3)));
		
		eh.stream()
		.filter(n -> Integer.parseInt(n) > 5).map(n -> n.charAt(0)).forEach(System.out::println);
		
		String ayh = eh.stream()
		.filter(n -> Integer.parseInt(n) > 5).map(n -> n.charAt(0) + "").collect(Collectors.joining(","));
		System.out.println(ayh);
	}

}
