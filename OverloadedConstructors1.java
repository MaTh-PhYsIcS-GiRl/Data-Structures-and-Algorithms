
public class OverloadedConstructors1 {
	String name;
	int age;
	OverloadedConstructors1(){
		this(null, 0); //invokes constructor accepting 2 arguments
		//Employee(null, 0) is wrong, needs to be this(null, 0)
		//this(null, 0) must be first statement in the constructor
		//can't include multiple calls in a constructor
		//constructors can't be called from any method (except by using new keyword)
	}
	public OverloadedConstructors1(String newName, int newAge) {
		name = newName;
		age = newAge;
	}
}
