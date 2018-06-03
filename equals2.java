/**
 * .equals method only compares whether two object variables refer to same object
 * @author Deepansha Singh
 *
 */
public class equals2 {
	String acctnumber;
	int acctType;
	public boolean equals(Object anObject) {
		if (anObject instanceof equals2) {	//checking whether we are comparing same TYPE of objects
			equals2 b = (equals2)anObject;
			return (acctnumber.equals(b.acctnumber) &&
			acctType == b.acctType);	//NEED TO HAVE SAME VALUES
			}
			else
			return false;
	}
}

class Tester
{
	public static void main(String[] Deepansha)
	{
		equals2 b1 = new equals2();
		b1.acctnumber = "0023490";
		b1.acctType = 4;
		equals2 b2 = new equals2();
		b2.acctnumber = "11223344";
		b2.acctType = 3;
		equals2 b3 = new equals2();
		b3.acctnumber = "11223344";
		b3.acctType = 3;
		System.out.println(b1.equals(b2));//FALSE BECAUSE VALUE OF REFERENCE VARIABLES B1 AND B2 DON'T MATCH
		System.out.println(b2.equals(b3));//TRUE because VALUE OF REFERENCE VARIABLES MATCH
		System.out.println(b1.equals(new String("abc")));//FALSE BECAUSE METHOD IS NOT OF TYPE equals2
	/**
	 * previous definition of equals() method would return true for any object, because it doesn't compare any values
	 * 
	 */
	}
}