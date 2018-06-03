public class ReverseString {


    public static String reverse(String input)
    {

        return recursiveHelper(input,0);
    }

    public static String recursiveHelper(String strInput, int index)
    {
        if(index == (strInput.length() - 1 ))
            return "" + strInput.charAt(index) ;
        else 
            return recursiveHelper(strInput,index+1) + strInput.charAt(index);
    }
    
    public static void main(String args[])
    {
        System.out.println(reverse("Deepansha"));
    }

}