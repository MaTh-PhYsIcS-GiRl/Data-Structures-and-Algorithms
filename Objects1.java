import java.util.List;
import java.util.LinkedList;

class Object1{  

	int id;  
    String name, author, publisher;  
    int quantity;  

public Object1(int id, String name, String author, String publisher, int quantity)
{  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  

}  

public class Objects1 {  
public static void main(String[] args) {  
   
	//Creating list of Books  
    List<Object1> list=new LinkedList<Object1>();  
    
    //Creating Books  
    Object1 b1=new Object1(101,"Let us C","Yashwant Kanetkar","BPB",8);  
    Object1 b2=new Object1(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    Object1 b3=new Object1(103,"Operating System","Galvin","Wiley",6);  
    
    //Adding Books to list  
    list.add(b1);  
    list.add(b2);  
    list.add(b3);  
    
    //Traversing list by a for:each loop
    for(Object1 b : list)
    {  
    	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
}  
}  