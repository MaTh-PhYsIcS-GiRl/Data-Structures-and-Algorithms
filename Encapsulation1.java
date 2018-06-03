/**
 * Encapsulation = information hiding
 * hide the internal data by making instance variables private
 * @author Deepansha Singh
 *
 */
public class Encapsulation1 {
	
	private double weight;
	public void setWeight(double val)
	{
		if (val >= 0 && val <= 1000)
		{
			weight = val;
		}
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public static void main(String[] Deepansha)
	{
		Encapsulation1 one = new Encapsulation1();
		one.setWeight(-12.23);
		System.out.println(one.getWeight());
		
		one.setWeight(7000);
		System.out.println(one.getWeight());
		
		one.setWeight(400);
		System.out.println(one.getWeight());
	}
}
