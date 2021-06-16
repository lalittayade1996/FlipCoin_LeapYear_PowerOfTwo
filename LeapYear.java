import java.util.Scanner;

public class LeapYear {

	public static int method() {
        System.out.println("Enter year....");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
            System.out.println(year+" Is a leap Year");
        else
            System.out.println(year + " Is Not a Leap Year");
		return year;
 		
	}
    public static void main(String[] args) {
//    	method();
//    	LeapYear leapYear = new LeapYear();
    	LeapYear.method();
   }
    
}
