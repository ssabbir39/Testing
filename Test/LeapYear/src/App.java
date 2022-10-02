import java.util.Scanner;
class LeapYearCheck{
    int year;
    // Taking input From User
    void takeInput ()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("\nLEAP YEAR CHECKING (1500 - 4000) ");
        System.out.print("Enter the year  = ");
        year = input.nextInt();
        input.close();
    }
    // Checking Leap Year or not
    boolean check (int yr)
    {
        
        if (yr % 4 == 0)
        {
            if (yr % 100 == 0)
            {
                if (yr % 400 == 0)
                {                    
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}
public class App {
    public static void main(String [] args)
    {
        LeapYearCheck obj = new LeapYearCheck();
        obj.takeInput();
        boolean flag = obj.check(obj.year);
        if(flag)
        {
            System.out.println(obj.year + " is a leap year .");
            return;
        }
            System.out.println(obj.year + " is not a leap year .");
    }    
}