
public class CountOddDigits {

	public static int oddDigitCounter(int number) {
	    if (number==0) {
	        return 0;
	    }
	    return (number%2) + oddDigitCounter(number/10);
	}

	public static void main(String[] args)
	{
		System.out.println(oddDigitCounter(4563345));
	}
}
