/**
 * CAN NEVER BE KNOWN WHICH OBJECTS FOR SURE WILL GO IN GC,
 * ONLY WHICH OBJECTS ARE ELIGIBBLE FOR GC
 */
public class DeReferencing {
	String name;
	public DeReferencing(String name)
	{
		this.name = name;
	}
	
	public static void main(String[] Deepansha)
	{
		DeReferencing one  = new DeReferencing("PHP");
		one = null;
		one = new DeReferencing("Java");	//dereferenced 
		one = new DeReferencing("SQL");	//dereferenced by reassignment and eligible for GC
		
		DeReferencing two = new DeReferencing("PMP");
		two = one;	//dereferencing
	}
}
