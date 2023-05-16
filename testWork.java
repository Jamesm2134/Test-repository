import java.util.*;
public class testWork {

    
    public static void main(String[] args) 
    {
        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);
        //**************
        // Project 1
        //**************
        System.out.println("*********** Budget Calculator ***********");
        
        // Variables 
        
        int rent;
        int internet;
        int grocery;
        int fun;
        int hourlyWage;
        String occupation;
        // Math

        String Charlie = "poop";
        System.out.println(Charlie);

        System.out.print("Enter how much money you spend a month on rent: ");
        rent = scanInt.nextInt();
        System.out.print("Enter how much money you spend a month on internet: ");
        internet = scanInt.nextInt();
        System.out.print("Enter how much money you spend a month on groceries: ");
        grocery = scanInt.nextInt();
        System.out.print("Enter how much money you spend a month on fun: ");
        fun = scanInt.nextInt();
        System.out.print("Enter your hourly wage: ");
        hourlyWage = scanInt.nextInt();
        System.out.print("Enter your occupation: ");
        occupation = scanStr.nextLine();

        int total = (rent) + (internet) + (grocery) + (fun);
        double monthlyHours = total / hourlyWage;
        double weeklyHours = monthlyHours / 4;
        double dailyHours = weeklyHours / 7;
        double HELPME = Math.round(dailyHours*100)/100;
        double extraMoney = (total + 100) / (10) / (4) / (7);
        double pernis = Math.round(extraMoney*100)/100;
        // Print out

        System.out.println("The amount of hours per day a " + occupation + " would need to work to break even is " + HELPME);
        System.out.println("The amount of hours per day a " + occupation + " would need to work to have an additonal $100 would be " + pernis);
        System.out.print("***************************************************************************************");
    }

}