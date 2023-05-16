public class testWork {

    
    public static void main(String[] args) 
    {
        //**************
        // Project 1
        //**************
        System.out.println("*********** Budget Calculator ***********");
        
        // Variables 
        
        int rent = 625;
        int internet = 27;
        int grocery = 250;
        int fun = 150;
        int hourlywage = 10;
        // Math

        int total = (rent) + (internet) + (grocery) + (fun);
        double monthlyHours = total / 10;
        double weeklyHours = monthlyHours / 4;
        double dailyHours = weeklyHours / 7;
        double extraMoney = (total + 100) / (10) / (4) / (7);
        // Print out

        System.out.println("Hourly wage is $10");
        System.out.println("Money for rent is $625");
        System.out.println("Money for internet is $27");
        System.out.println("Money for grocery's is $250");
        System.out.println("Money for fun allowance is $150");
        System.out.println("The total is $1052");
        System.out.println("The amount of hours per day a ta/grader would need to work to break even is " + dailyHours);
        System.out.println("The amount of hours per day a ta/grader would need to work to have an additonal $100 would be " + extraMoney);
        System.out.print("***************************************************************************************");
    }
    
    

}