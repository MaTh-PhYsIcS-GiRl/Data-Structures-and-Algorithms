/**
 * CONCEPT:
 * Within a method, a method parameter takes precedence over an object field.
 * When the method modifyVal refers to the variable age, it refers to the method
 * parameter age, not the instance variable age. To access the instance variable
 * age within the method modifyVal, the variable name age needs to be prefixed
 * with the keyword this (this is a keyword that refers to the object itself).
 * @author Deepansha Singh
 *
 */
public class MethodsConcept1 {

	int age;
	void modifyVal(int age)
	{
		age += 1;
		System.out.println("Method Parameter : " + age);
		System.out.println("\nInstance Variable : " + this.age);
	}
	
	public static void main(String[] args)
	{
		MethodsConcept1 one = new MethodsConcept1();
		one.modifyVal(4);
	}
}
