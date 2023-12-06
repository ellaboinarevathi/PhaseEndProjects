package project;
import java.util.Scanner;

public class Movie {

static Scanner sc = new Scanner(System.in);
	
	public static void login() {
		System.out.print("USERNAME - ");
 		String username=sc.next();
 		System.out.print("PASSWORD - ");
 		String password=sc.next();
 		System.out.println("Do you want to update password(y/n)");
		String up = sc.next();
		if(up.equalsIgnoreCase("y")) {
			System.out.println("Enter new password :  ");
			String update_password=sc.next();
	 		if(username.equals("admin") && password.equals("admin123") | password.equals(update_password)) {
				System.out.println(" You have Successfully login ");
			}else {
				System.out.println("Failure try once again");
			}
		}
		
 		
	}
 		public static void Movieseat() {
			System.out.println("Select the seats");
			String seat[]={"1. B1 ", "2. B2 ", "3. B6 ","4. B1-B5 "};
			for(int i=0;i<seat.length;i++) {
				System.out.println(seat[i]);
			}
			int choice = sc.nextInt();
			System.out.println(seat[choice-1]);
 		}
	
	public static void output()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the showtime : ");
			String st=sc.next();
			if(st=="9am" || st=="2pm" || st=="6pm" || st=="9pm") {
				System.out.println("Enter the number of tickets : ");
			}
			else {
				System.out.println("Please enter valid showtime...");
				String st1=sc.next();
				System.out.println("Enter the number of tickets : ");
			}
			
			int tickets =sc.nextInt();
			Movieseat();
			System.out.println("Total amount to pay : "+tickets*200);
			System.out.println("Do you want to continue(y/n)");
			String con = sc.next();
			if(con.equalsIgnoreCase("y")) {
				System.out.println("Congratulations your tickets are successfully booked !!! ");
			}
			else {
				System.out.println("Failed to book tickets....please try again!!!");
			}
	}
	
}
