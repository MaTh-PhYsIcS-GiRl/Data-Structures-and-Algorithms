import java.util.*;
public class ObjectsInMaps {
	String name;
	String clg;
	String branch;
	double per;
	
	ObjectsInMaps(String s1, String s2, String s3, double p)
	{
		name = s1;
		clg = s2;
		branch = s3;
		per = p;
	}
	
}
class Check2
{
	public static void main(String Deepansha[])
	{
		HashMap<Integer, ObjectsInMaps> hm = new HashMap<Integer, ObjectsInMaps>();
		
		ObjectsInMaps x1=new ObjectsInMaps("goutham","SNIST","cse",68.5);
		ObjectsInMaps x2=new ObjectsInMaps("kanakesh","SNIST","ecm",70);
		ObjectsInMaps x3=new ObjectsInMaps("rahul","SNIST","ecm",75);
		ObjectsInMaps x4=new ObjectsInMaps("vasista","SNIST","ECM",80);
		ObjectsInMaps x5=new ObjectsInMaps("narayana","SNIST","EEE",85);
		
		hm.put(1, x1);
		hm.put(2, x2);
		hm.put(3, x3);
		hm.put(4, x4);
		hm.put(5, x5);
		
		Iterator trav = hm.entrySet().iterator();
		
		while(trav.hasNext())
		{
			Map.Entry record=(Map.Entry)trav.next();  //will give next (Key, Value) pair
			ObjectsInMaps j= (ObjectsInMaps)record.getValue();
	                System.out.println(record.getKey()+ " " + j.name + " "+ j.clg + " " + j.branch
	                		+ " " + j.per);
		}
		
	}
}
