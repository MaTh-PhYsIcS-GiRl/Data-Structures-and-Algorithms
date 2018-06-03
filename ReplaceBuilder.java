
public class ReplaceBuilder {
	
	public static void main(String[] args)
	{
		StringBuilder sb1 = new StringBuilder("0123456");
		sb1.replace(2, 4, "ABCD");	//replaces 2 and 3, not including 4
		System.out.println(sb1);
	}
}
