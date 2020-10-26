class Frog{ //sort of like encapsulation
	private  String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int agezz) {
		this.age = agezz;
	}
	
}
public class GettersAndSetters {

	public static void main(String[] args) {
		
		Frog frogobj=new Frog();
	//frogobj.name="briteney";   //if we make the varibales private u can no longer access them directly like this
	//frogobj.age=20;
	//	System.out.println(frogobj.name);
		//System.out.println(frogobj.age);
		frogobj.setAge(10);
		frogobj.setName("Milan");
		int age_Of_Frog=frogobj.getAge();
		System.out.println(age_Of_Frog);
		

	}

}
