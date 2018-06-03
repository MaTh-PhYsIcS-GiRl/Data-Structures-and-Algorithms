import java.time.LocalDate;
import java.time.Month;

/**
 * store dates with and without time zones
 * instances are immutable, and safe to be used in a multithreaded environment
 * @author Deepansha Singh
 *
 */
public class LocalDate1 {
	public static void main(String[] args)
	{
		//LocalDate method is private, so use one of the factory methods to instantiate
		LocalDate date1 = LocalDate.of(2015, 12, 27);//accepts year, date, and month, int values
		LocalDate date2 = LocalDate.of(2015, Month.DECEMBER, 27); //accepting month as ENUM CONSTANT
		
		//to get current date from clock, use static method now()
		LocalDate date3 = LocalDate.now();
		
		//parse a string to instantiate LocalDate
		LocalDate date4 = LocalDate.parse("2025-08-09"); //999-99-99 format
		//querying localdate, retreive as int or enum constant
		LocalDate date = LocalDate.parse("2020-08-03");
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getDayOfYear());
		System.out.println(date.getMonth());
		System.out.println(date.getMonthValue());
		System.out.println(date.getYear());
		
		
		//using instance methods isAfter and isBefore for chronological ordering of time
		LocalDate myBirthday = LocalDate.parse("2002-10-30");
		LocalDate diyaBirthday = LocalDate.parse("2008-03-06");
		System.out.println("\n" + myBirthday.isAfter(diyaBirthday));
		System.out.println(myBirthday.isBefore(diyaBirthday));
		System.out.println(myBirthday.isBefore(myBirthday));	//FALSE
	}
}
