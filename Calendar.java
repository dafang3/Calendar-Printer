public class Calendar 
{
    public static void main (String[] args) 
    {
        int x = 1;
        while ( x < 31 ) 
        {
            if ( x == 6 || x == 7 || x == 13 || x == 14 || x == 20 || x == 21 || x == 27 || x == 28)
                {
                    System.out.println(" - WEEKEND");
                }
            else if ( x == 8 )
                {
                    System.out.println(" - NO SCHOOL (LABOR DAY)");
                }
            else if ( x == 26 )
                {
                    System.out.println(" - END OF THE MARKING PERIOD");
                }    
            else
                {
                    System.out.println("");
                }    
            System.out.print("September " + x );
            x++;
            if ( x == 31 )
                {
                    System.out.println(" ");
                }
        }
    }
}