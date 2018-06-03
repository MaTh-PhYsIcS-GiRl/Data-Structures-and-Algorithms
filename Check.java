import java.util.HashMap;
class Check
{
	public static void main(String arg[]) 
	{	
	   HashMap<Integer, String> hm=new HashMap<Integer, String>();
	   
       hm.put(17,"abhishek");
 
       hm.put(50,"ajith");
 
	   hm.put(71,"alekhya");
 
	   hm.put(11,"amani");
 
	   String s=hm.get(50);    //s="ajith";
 
	   System.out.println(s);  
 
	   s=hm.get(11);          // s="amani";
 
	   System.out.println(s);
	}
}