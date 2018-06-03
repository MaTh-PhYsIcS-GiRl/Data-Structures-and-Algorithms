/**
 * CONCEPT : CAN USE RETURN() STATEMENT WITH VOID METHOD
 * @author Deepansha Singh
 *
 */
public class VoidReturn {
	double weight;
	
	/**
	 * following code won't compile, because return() is before weight = val
	 * return statement must be last statement TO EXECUTE in method
	 * @param val
	 */
//	public void setWeight(double val)
//	{
//		return;
//		weight  = val;
//	}
	
	/**
	 * FOLLOWING WILL COMPILE :
	 */
	
	void setWeight(double val)
	{
		if (val < 0)
			return;
		else
			weight = val;
	}
}
