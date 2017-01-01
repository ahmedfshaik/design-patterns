package edu.home.singleton;

public class SingletonPatternTest {

	public static void main(String[] args) {
		// illegal construct
		// Compile Time Error: The constructor SingleObject() is not visible
		// SingleObject object = new SingleObject();// Get the only object available
		SingleObject object = SingleObject.getInstance();
		SingleObject object2 = SingleObject.getInstance();
		// show the message
		object.showMessage();
		object2.showMessage();

	}

}
