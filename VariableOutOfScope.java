
public class VariableOutOfScope {

	public void myMethod() {
		int result = 88;
		if(result > 78) {
			ObjectLife1 one = new ObjectLife1();
			one.setName("Android");
			//one variable's scope is this if statement block, then
			//it goes out of scope and is eligible for Java garbage collection
		}
		else
		{
			ObjectLife1 one = new ObjectLife1();
			one.setName("MYSQL");
		}
	}
}
