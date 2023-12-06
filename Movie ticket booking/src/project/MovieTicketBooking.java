package project;

import java.util.Scanner;

import project.service.MovieShowService;

public class MovieTicketBooking {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("+----------------------------------------+");
	 		System.out.println("|  WELCOME TO MOVIE TICKET BOOKING APP  |");
	 		System.out.println("+----------------------------------------+");
	 		System.out.println("PLEASE LOGIN TO CONTINUE -");
	 		Movie.login();
	 		System.out.println("Enter the date : ");
	 		String date=sc.next();
	 			project.service.MovieShowService ms = new MovieShowService();	 			
	 			ms.searchMoviInfoByDate(date);
	 			Movie.output();
	 			
		}
}
