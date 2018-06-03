import java.io.*;
public class WordTester {
	
	 public static void main(String[] Inspirational_Quotes) {
		 
		 // validate command line arguments
		  if(Inspirational_Quotes.length != 1) {
				System.err.println("Error: usage - Tester file");
				System.exit(1);
		  }
		  
		  try {
				// open up the file for reading
				FileReader input = new FileReader(Inspirational_Quotes[0]);
		        BufferedReader in = new BufferedReader(input);
		  
				// now read each line and print it out
				String line;
				while((line = in.readLine()) != null)
					 System.out.println(line);
				} 
		  catch(FileNotFoundException e) {
				System.err.println("File " + Inspirational_Quotes[0] + " not found.");
				System.exit(1);
				}
		  catch(IOException e) {
				System.err.println(e);
				System.exit(1);
		  }
	 }
}