/**
 * ALL CLASSES EXTEND java.lang.object
 * elements of type java.lang.object can refer to any object
 * an array is an object
 * the element of the array of java.lang.Object can refer to another array
 * @author Deepansha Singh
 *
 */
public interface MyInterface {
	class MyClass1 implements MyInterface{};
	abstract class Vehicle{}
	class Car extends Vehicle{}
	class Test{
		
		Object[] objArray = new Object[] {
			new MyClass1(),
			null,
			new Car(),
			new java.util.Date(),
			new String("name"),
			new Integer[7]
		};
	}
}
