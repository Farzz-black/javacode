class Person1 {
	int age;
	String name;

	int calculateRetirement() {
		int retirement = 65 - age;
		return retirement;
	}
	int getAge() {
		return age;
	}
}

public class Return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person1 personObject = new Person1();
		personObject.name = "John";
		personObject.age = 30;
		int ret = personObject.calculateRetirement();
		System.out.println(ret);
		int age_Of_John=personObject.getAge();
		System.out.println(age_Of_John);

	}

}
