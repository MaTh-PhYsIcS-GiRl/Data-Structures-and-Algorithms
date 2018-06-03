//import java.util.Queue;  
import java.util.PriorityQueue;
import java.util.Iterator;

public class Example2
{  
	public static void main(String args[]){  

		PriorityQueue<String> queue=new PriorityQueue<String>();  

		queue.add("Deepansha");  

		queue.add("is");  

		queue.add("the");  

		queue.add("most");  

		queue.add("AWESOME person ever!");
		

		System.out.println("head:"+queue.element());  //HEAD : most recent (latest) element added to the list

		System.out.println("head:"+queue.peek());  //retrieves and returns the head 

		System.out.println("\niterating the queue elements:");  

		
		Iterator itr = queue.iterator();  

		
		while(itr.hasNext()){  

			System.out.println(itr.next());  

		}  

		queue.remove();  
		//.remove() : retrieves and removes the head of this queue.

		queue.poll();  
		//.poll() : retrieves and removes the head of this queue, or returns null if this queue is empty.

		System.out.println("\nafter removing two elements:");  

		
		Iterator<String> itr2=queue.iterator();  

		while(itr2.hasNext()){  

			System.out.println(itr2.next());  

		}  

	}  
}  