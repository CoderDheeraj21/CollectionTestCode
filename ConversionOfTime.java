import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class ConversionOfTime{

    public static String convertingTimeToMilitaryFomrat(String time) 
    {
        try 
        {
            DateFormat Hour_12_Format = new SimpleDateFormat("hh:mm:ss a");
            DateFormat Hour_24_Format = new SimpleDateFormat("HH:mm:ss");

            Date date = Hour_12_Format .parse(time);

            String militaryTime = Hour_24_Format .format(date);
            return militaryTime;
        } 
        catch (ParseException e) 
        {

            e.printStackTrace();
            return ""; 
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time in 12 hour format i.e hour:minute:second am/pm");
        String inputTime = sc.nextLine();
        sc.close();

        String militaryFormatTime = convertingTimeToMilitaryFomrat(inputTime);
        if (!militaryFormatTime.isEmpty()) 
        {
            System.out.println("Military Time: " + militaryFormatTime);
        } 
        else 
        {
            System.out.println("Time format is not valid");
        }
    }
}
