
public class AppendMethod2 {
	String s;
	public AppendMethod2(String s)
	{
		this.s = s;
	}
	public static void main(String[] args)
	{
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Java");
		sb1.append(new AppendMethod2("Oracle"));
		System.out.println(sb1);
	}
}

