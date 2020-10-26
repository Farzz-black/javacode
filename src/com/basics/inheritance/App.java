package com.basics.inheritance;

public class App extends Machine {

	public static void main(String[] args) {
	App app=new App();
	app.start();
	Machine machine=new Machine();
	machine.start();
	machine.stop();
	car carobj=new car();
	carobj.start();
	carobj.stop();
	carobj.getMachineName();
	

	}

}
