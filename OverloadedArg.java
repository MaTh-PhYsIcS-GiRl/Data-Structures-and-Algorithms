/**
 * change in # of parameters is accepted
 * change in types of parameters is accepted
 * change in positions of parameters is accepted
 * @author Deepansha Singh
 *
 */
public class OverloadedArg {
	
	double calcAverage(int marks1, double marks2)
	{
		return (marks1+marks2)/2.0;
	}
	double calcAverage(int marks1, int marks2, int marks3)
	{
		return (marks1+marks2+marks3)/3.0;
	}
	/**
	 * not accepted, because all 3 parameters are ints just like the other overloaded method
	 */
//	double calcAverage(int marks1, int marks3, int marks4)
//	{
//		return (marks1+marks2+marks3)/3.0;
//	}
	
	/**
	 * WON'T COMPLILE : 
	 */
//	double calcAverage(int[] marks)
//	{
//		
//	}
//	
//	double calcAverage(int... marks)
//	{
//		because the ...marks means varargs are implemented as arrays
//	}
}
