import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
class Check1
{
 public static void main(String arg[])
 {
   HashMap<Integer, String> hm= new HashMap<Integer, String>();
 
   hm.put(17, "abhishek");
 
   hm.put(57, "anusha");
 
   hm.put(50,"ajith");
 
   hm.put(33,"aparna");
 
   hm.put(71,"alekhya");
 
   hm.put(99,"babitha");
 
   hm.put(11,"amani");
 
   Iterator trav = hm.entrySet().iterator();
   /**
    * line 24 = 
    * Set set=hm.entrySet();
    * Iterator trav=set.iterator();
    */
   while(trav.hasNext())
   {
      Map.Entry record = (Map.Entry)trav.next();  //will give next (Key, Value) pair
 
      System.out.println(record.getKey()+ "–>" +record.getValue());
   }
   
   /**
    * instead of using entry set, use key set to get same result as above
    */
   
   Set set=hm.keySet();
 
   Iterator trav1=set.iterator();
   
   System.out.println();
   while(trav1.hasNext())
   {
	   Integer key=(Integer)trav1.next(); //will give next Key
	   String value=hm.get(key);
	   System.out.println(key+"-->"+value);
   }

   /**
    * printing out the values instead of the keys
    */
   Collection col=hm.values();
   
   Iterator trav2 = col.iterator();
   System.out.println();
   while(trav2.hasNext())
   {
 
     String value=(String)trav2.next();  // will give next Value
  
     System.out.println(value);
   }
 }
}