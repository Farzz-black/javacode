class Camera extends Machine{//all abstract methods must be defined

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("camera started");
		
	}
	
}

class Car extends Machine{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		 System.out.println("car started");
	}
	
}




 abstract class Machine{//cannot create obejct of machine-->new machine();
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public  abstract  void start();
		
	
}




public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Camera cam=new Camera();
		cam.setId(2);
		Car car=new Car();
		car.setId(3);
	}

}
