/**
 * if array type is an abstract class, its elements are either null or objects of concrete classes
 * extending abstract classes
 * @author Deepansha Singh
 *
 */
abstract class AbstractClassArray {
	class Car extends AbstractClassArray{}
	class Bus extends AbstractClassArray{}
	class Test{
		AbstractClassArray[] vehicleArray = {new Car(),
				new Bus(), null};
		}
	
}
