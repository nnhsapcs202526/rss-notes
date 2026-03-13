import java.util.ArrayList;

/**
 * Write a description of class RecursionNotes here.
 *
 * @author mrcallaghan
 * @version 11mar2026
 */
public class RecursionNotes
{
    public static String reverseIter(String str)
    {
        String strReversed = "";

        for(int i = 0; i < str.length(); i++)
        {
            strReversed = str.substring(i, i+1) + strReversed;
        }

        return strReversed;
    }
    
    public static String reverse(String str)
    {
        //  must have a terminating case, or base case (i.e., "the empty loaf")
        if(str.equals(""))
        {
            return str;
        }
        
        // take a small step towards the solution (i.e., "one slice of bread")
        String firstChar = str.substring(0, 1);
        String restOfString = str.substring(1);
        
        // recurse - call this method with a simpler problem (i.e., "dreams within dreams")
        String restOfStringReversed = reverse(restOfString);

        
        String strReversed = restOfStringReversed + firstChar;
        return strReversed;
            
    }
    
    public static ArrayList<Integer> makeList( int n )
    {
        ArrayList<Integer> tempList = null;
        if( n <= 0 )  					// The smallest list we can make (terminating condition)
        {
            tempList = new ArrayList<Integer>();
            return tempList;
        }
        else        					// All other lists are created here
        {
            tempList = makeList( n - 1 );  	        // Pass on the smaller problem to solve elsewhere
            tempList.add( n );             	        //Add our contribution to solving the larger problem 
        }

        return tempList;	
    }

}
