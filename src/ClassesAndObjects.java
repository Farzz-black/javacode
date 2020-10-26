class Person {
	// data
	// methods
	String name;//instance variable
	int age;//method can access instance variable
	String fullName="Ismail";
	void speak() {
		System.out.println("Hi my name is "+name+" and my age is "+age);
		System.out.println(fullName);
//		System.out.println(education); //cannot accesss
		int a =10;
		System.out.println(a);
	}

	

}

public class ClassesAndObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person personobject = new Person(); // type variablename=new classname
		personobject.name = "Farz";
		personobject.age = 22;
		String education="btech";
		System.out.println(personobject.name);
		personobject.speak();
		System.out.println(personobject.fullName);
		

	}

}
