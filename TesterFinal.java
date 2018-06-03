import java.io.*;
import java.util.Scanner;
public class TesterFinal {

	private int[] myData = new int[1000];

	public TesterFinal(String Inspirational_Quotes)
	{
		loadFile("Inspirational_Quotes");
	}
	
	public void loadFile(String Inspirational_Quotes)
	{
		int index = 0; 
		File file = new File(Inspirational_Quotes);
		try{
			Scanner inFile = new Scanner(file);
			while (inFile.hasNext())
			{
				myData[index] = inFile.nextInt();
				index++;
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not Found in Directory.");	
		}
	}
	
	public static void main(String[] args)
	{
		TesterFinal one = new TesterFinal("Inspirational_Quotes");
		//one.loadFile("Inspirational_Quotes");
	}
	
}
