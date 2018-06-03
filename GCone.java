public class GCone {
	private String name;
	private GCone other;
	public GCone(String name)
	{
		this.name = name;
	}
	public void setExam(GCone exam)
	{
		other = exam;
	}
	
}
/**
 * group of instances with no external references =  
 * island of isolation = 
 * eligible for GC
 * @author Deepansha Singh
 *
 */
class IsolandOfIsolation
{
	public static void main(String[] Deepansha)
	{
		GCone one = new GCone("Java");
		GCone two = new GCone("PHP");
		
		one.setExam(two);
		two.setExam(one);
		
		one = null;	//not eligible for GC, because can still be referenced by the other variable
		two = null;	//now both ojects are eligible for Java GC
	
	}
}
