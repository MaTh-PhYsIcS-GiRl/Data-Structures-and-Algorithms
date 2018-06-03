
public class PrivateObjectField {
	private String name;	//object with private field access
	int age;
	PrivateObjectField()
	{
		age = 22;
	}
	public void setName(String val) {
		name = val;	//won't be able to set value, because name is private
	}
	private void print() {
		System.out.println("name " + name  + " age" + age);	//need to call getName() to change value
	}
	
	public static void main(String[] family)
	{
		PrivateObjectField one = new PrivateObjectField();
		one.print();
	}
}
