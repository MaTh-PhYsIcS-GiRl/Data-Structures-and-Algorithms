
public class Equals1 {
	public static void main(String[] args)
	{
		String var1 = new String("Java");
		String var2 = new String("Java");
		System.out.println(var1.equals(var2));	//TRUE
		System.out.println(!(var1.equals(var2)));	//FALSE
		System.out.println(var1 == var2);	//FALSE
		System.out.println(var1 != var2);	//TRUE -- opposite of ==
		//== compares whether variables refer to same object
		
		System.out.println();
		
		//in SAME STRING CONSTANT POOL  :
		String var3 = "code";
		String var4 = "code";
		System.out.println(var3.equals(var4));	//TRUE
		System.out.println(var3 == var4);	//TRUE
		System.out.println(var3 != var4);	//FALSE
	}
}
