public class Calendar1
{
    public static void main (String[] args) 
    {
        int x = 1;
        while ( x < 31 ) 
        {
            if ( 6 == x%7 || 0 == x%7 )
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
                    System.out.println(" ");
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