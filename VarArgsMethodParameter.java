/**
 * ... indicates : 
 * variable length argument
 * method paramater days may be passed in an array or multiple comma separated values
 * Java creates an array behind the scenes to implement it
 * CAN ONLY DEFINE ONE VARIABLE ARGUMENT in a parameter list, MUST be the LAST variable in the list
 * 
 * @author Deepansha Singh
 *
 */
public class VarArgsMethodParameter {
	public int daysOfWork(int... days)
	{
		int daysOff = 0;
		for(int i = 0; i < days.length; i++)
			daysOff += days[i];
		return daysOff;
	}
}
