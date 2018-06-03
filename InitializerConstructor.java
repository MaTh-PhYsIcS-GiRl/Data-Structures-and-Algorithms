
public class InitializerConstructor {
	InitializerConstructor(){
		System.out.println("HI");
	}
	{
		System.out.println("HI");
	}
	
	public static void main(String[] args)
	{
		InitializerConstructor one = new InitializerConstructor();
		//WILL PRINT OUT HI TWICE
	}
}
