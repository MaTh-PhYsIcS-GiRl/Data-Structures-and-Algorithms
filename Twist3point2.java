/**
 * WON'T COMPILE, because
 * this() is referecing to a constructor with no parameters -- which is the same 
 * method that it is residing in
 * @author Deepansha Singh
 *
 */
public class Twist3point2 {

	String name;
	int age;
	Twist3point2()
	{
		this ();
	}
	Twist3point2(String newName, int newAge)
	{
		name = newName;
		age = newAge;
	}
}
