
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
            strReversed = str.substring(i, i + 1) + strReversed;
        }
        
        return strReversed;
    }
    
    public static String reverse(String str)
    {
        //1. must have a terminating case, or base case (i.e., "the empty loaf")
        if(str.equals(""))
        {
            return str;
        }
        
        //2. take a small step towards a solution (i.e., one slice)
        String firstChar = str.substring(0,1);
        String restOfString = str.substring(1);
               
        //3. recurse - call this method with a simpler problem (i.e., dreams within dreams)
        String restOfStringReversed = reverse(restOfString);
        
        String strReversed = restOfStringReversed + firstChar;
        return strReversed;
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
