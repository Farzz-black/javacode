import java.util.ArrayList;

public class ArrayLIst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(100);
		numbers.get(0);
		// looinmg
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers);
		}

		// or
		for (int value : numbers) {
			System.out.println(value);
		}

	}
}
