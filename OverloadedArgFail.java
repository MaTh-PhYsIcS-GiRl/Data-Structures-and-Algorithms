
public class OverloadedArgFail {

	double calcAverage(double marks1, int marks2)
	{
		return (marks1 + marks2)/2.0;
		
	}
	
	double calcAverage(int marks1, double marks2)
	{
		return (marks1 + marks2)/2.0;
	}
	
	public static void main(String[] args)
	{
		OverloadedArgFail one = new OverloadedArgFail();
		one.calcAverage(2, 3);	//can't compile, because can't choose which overloaded method should 
		//be called
	}
}
