package project.service;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import project.movie.MovieShow;
import project.movie.MovieShowInfo;

public class MovieShowService {
	List<MovieShow> movieShow = new ArrayList<>();
	public MovieShowService() {
	MovieShow ms1 = new MovieShow();
	ms1.setShowDate("7-Dec");
	MovieShow ms2 = new MovieShow();
	ms2.setShowDate("8-Dec");
	MovieShow ms3 = new MovieShow();
	ms3.setShowDate("9-Dec");
	MovieShow ms4 = new MovieShow();
	ms4.setShowDate("10-Dec");
	MovieShow ms5 = new MovieShow();
	ms5.setShowDate("11-Dec");
	MovieShow ms6 = new MovieShow();
	ms6.setShowDate("12-Dec");
	movieShow.add(ms1);
	movieShow.add(ms2);
	movieShow.add(ms3);
	movieShow.add(ms4);
	movieShow.add(ms5);
	movieShow.add(ms6);
	}
	
	public void showMoviewAndSeatInfo() {
		Iterator<MovieShow> li = movieShow.iterator();
		while(li.hasNext()) {
			MovieShow ms = li.next();
			System.out.println("-----------------------------");
			System.out.println("Date "+ms.getShowDate());
			MovieShowInfo msf[] = ms.getMovieShowInfo();
			for(MovieShowInfo mm : msf) {
				System.out.println("Show Time "+mm.getShowTime()+" Number of Seats "+mm.getNumberOfSeats()+" Price "+mm.getAmount());
			}
			System.out.println("------------------------------");
		}
	}
	
	public void searchMovieInfoByDate(String date) {
		int flag = 0;
		Iterator<MovieShow> li = movieShow.iterator();
		while(li.hasNext()) {
			MovieShow ms = li.next();
			if(ms.getShowDate().equals(date)) {
				flag++;
			System.out.println("-----------------------------");
			System.out.println("Date "+ms.getShowDate());
			MovieShowInfo msf[] = ms.getMovieShowInfo();
			for(MovieShowInfo mm : msf) {
				System.out.println("Show Time "+mm.getShowTime()+" Number of Seats "+mm.getNumberOfSeats()+" Price "+mm.getAmount());
			}
			System.out.println("------------------------------");
			}
		}
		if(flag==0) {
			System.out.println("No Show available on that date "+date);
			System.out.println("Please enter valid date : \n 1. 7-Dec  \n 2. 8-Dec  \n 3. 9-Dec  \n 4. 10-Dec  \n 5. 11-Dec \n 6. 12-Dec");
		}
	}
}
