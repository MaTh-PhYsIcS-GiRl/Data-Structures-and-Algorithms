
public class ObjectLife1Tester {
	public static void main(String[] DEEPANSHA)
	{
		ObjectLife1 one = new ObjectLife1();	//object creation #1 : new --> object creation
		one.setName("OCA Java Programmer 1");
		one = null;
		one = new ObjectLife1();	//ANOTHER OBJECT CREATION
		//1st variable  which was created in object creation #1 is unaccessible, so it is considered
		//for java garbage collection
		one.setName("PHP");
	}
}
