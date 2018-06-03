import java.util.ArrayList;
public class MyPerson {
	String name;
	MyPerson(String name)
	{
		this.name = name;
	}
	
	//overriding the equals() method
	public boolean equals(Object obj)
	{
		if (obj instanceof MyPerson)
		{
			MyPerson p = (MyPerson)obj;
			boolean isEqual = p.name.equals(this.name);	//returns FALSE if null value is passed
			return isEqual;
		}
		else
			return false;
	}
}
