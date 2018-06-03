import java.util.Arrays;

public class Example1

{
	String[] theArray;
	int arraySize;
	int itemsInArray = 0;
	
	Example1(int size){
		arraySize =  size;
		theArray = new String[size];
		Arrays.fill(theArray, "-1");
	}
	
	public void hashFunction1(String[] stringsForArray, String[] theArray)
	{
		for (int n = 0; n < stringsForArray.length; n++)
		{
			String newElementVal =  stringsForArray[n]; 
			
			theArray[Integer.parseInt(newElementVal)] = newElementVal;
		}
	}
	
	
	
	public static void main(String[] args) {
		Example1 e = new Example1(30);
		
		String[] elementsToAdd = {"1", "5", "17", "21", "26"};
		
		e.hashFunction1(elementsToAdd, e.theArray);
		
		e.display()
		}
	
	
}