class Robot {
	
void speak(String text) { //step 2:passing the value
	System.out.println(text);
}
}
public class MethodParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Robot robotObject=new Robot();
     String greeting="hi,how are you";
     robotObject.speak(greeting);//step 1
	}

}
