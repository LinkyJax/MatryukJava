public class Three {

    public static void main (String[] args){
        int[] numarray = { 1, 2, 3, 4, 5, 7, 8, 9, 11, 12};
 for (int i = 0; i < numarray.length; i++)
    {
        if (numarray[i] % 3 == 0)
        {
            System.out.print(numarray[i] + " ");
        }
    }}}
