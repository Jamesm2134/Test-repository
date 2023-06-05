import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A,B;
		int total;
		
		System.out.print("Enter two numbers, one after the other, in which you want to add: ");
		A = scan.nextInt();
		B = scan.nextInt();
		
		total = A + B;
		
		System.out.println("Your sum of " + A + " and " + B + " is: " + total);
		scan.close();

	}

}
