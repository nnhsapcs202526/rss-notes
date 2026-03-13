import java.util.ArrayList;

/**
 * Write a description of class PairSolutions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PairSolutions
{
    public static ArrayList<Integer> makeList( int n )
    {
        ArrayList<Integer> tempList = null;
        if( n <= 0 )  					// The smallest list we can make
        {
            tempList = new ArrayList<Integer>();
        }
        else        					// All other lists are created here
        {
            tempList = makeList( n - 1 );  	// Pass on the smaller problem to solve
            tempList.add( n );             	// Use it to solve the larger problem
        }

        return tempList;	
    }

}
