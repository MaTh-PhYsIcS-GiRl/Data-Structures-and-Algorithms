//class variables can be accessed without creating an object
//class won't compile if softKeyboard is private 
class TestClassVariable {
	public static void main(String[] args)
	{
		ClassVariables.softKeyboard = false;	//can be accessed even before creating any object
		
		//creating objects
		ClassVariables one = new ClassVariables();
		ClassVariables two = new ClassVariables();

		System.out.println(one.softKeyboard);	//prints false
		System.out.println(two.softKeyboard);	//prints false
		
		one.softKeyboard = true;
		System.out.println("\n" + one.softKeyboard);//prints true
		System.out.println(two.softKeyboard);//prints true
		System.out.println(ClassVariables.softKeyboard);//prints true
		
	}
}
