import java.util.Iterator;
import java.util.LinkedList;
public class Iterator1{  
 public static void main(String args[]){  
  
  LinkedList<String> list = new LinkedList<String>();  
  
  /**
   * populating the Linked List
   */
  	list.add("Deepansha");  
  	list.add("is");  
  	list.add("so");  
  	list.add("AWESOME!!!!!!");  
  
  
  	/**
  	 * Iterator object : access each element in the collection, one element at a time
  	 */
  	Iterator<String> itr = list.iterator();  
  
  	while(itr.hasNext()){  
  
  		System.out.print(itr.next() + " ");  
 
  	}  

 	}	  
}  