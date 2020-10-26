
public class Array {

	public static void main(String[] args) {
		int value=7;
		System.out.println(value);
		value=8;
		System.out.println(value);
		int values[]=new int[3];
		values[0]=10;
		values[1]=20;
		values[2]=30;
		System.out.println(values[0]);
		for(int i=0;i<values.length;i++) {
			System.out.println(values[i]);
		}
		String [] fruits= {"apple","orange"};
		for(String fruit:fruits) {
			System.out.println(fruit);
			
		}
	}
	//apple
	//orange


}
