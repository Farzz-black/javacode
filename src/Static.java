import com.basics.inheritance.App;
import com.basics.inheritance.Machine;

class Thing{
	public String name;
	public static int id;//1 memory is shared 
	public static int count=0;
	


public  void showName() {
	System.out.println(this.name);
	System.out.println(this.id++);
	
}
public  static void showId() {
	System.out.println(id);
	//System.out.println(name);
}

public Thing() {//cons
	this.count++;
}
}
public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thing.id=1;
		System.out.println("before creating obj " +Thing.count);
		Thing thingobj1=new Thing();
		System.out.println("after 1 cons is called " +Thing.count);
		Thing thingobj2=new Thing();
		System.out.println("after 2nd cons is called " +Thing.count);
		thingobj1.name="Fraz";
		thingobj2.name="new name";
		thingobj1.showName();
		//thingobj1.id=1;
		//System.out.println(thingobj1.id);
		
		Thing.showId();
		App app=new App();
		Machine machine=new Machine();
		System.out.println(machine.machineNam);

	}//class variables is shraed to all the objects but if it static it belongs to the class 

}
