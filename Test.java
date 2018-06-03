
public class Test {
	
	String name;
	
	public Test(String n)
	{
		name = n;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public String getName()
	{
		return name;
	}
	
	public static void resetValueOfMemberVariable(Test p1)
	{
		p1.setName("Deepansha");
	}

	public static void main(String[] args)
	{
		Test p1 = new Test("Diyansha");
		System.out.println(p1.getName());
		
		resetValueOfMemberVariable(p1);
		System.out.println(p1.getName());
		
	}
}
