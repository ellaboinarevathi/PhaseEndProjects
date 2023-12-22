package project.movie;

import java.util.Arrays;

public class MovieShow {
private String showDate;
private MovieShowInfo movieShowInfo[]=new MovieShowInfo[4];
public MovieShow() {
	MovieShowInfo msi1= new MovieShowInfo("9am",40,200);
	MovieShowInfo msi2= new MovieShowInfo("2pm",60,200);
	MovieShowInfo msi3= new MovieShowInfo("6pm",45,200);
	MovieShowInfo msi4= new MovieShowInfo("9pm",55,200);
	movieShowInfo[0]=msi1;
	movieShowInfo[1]=msi2;
	movieShowInfo[2]=msi3;
	movieShowInfo[3]=msi4;
}
public String getShowDate() {
	return showDate;
}
public void setShowDate(String showDate) {
	this.showDate = showDate;
}
public MovieShowInfo[] getMovieShowInfo() {
	return movieShowInfo;
}
public void setMovieShowInfo(MovieShowInfo[] movieShowInfo) {
	this.movieShowInfo = movieShowInfo;
}
@Override
public String toString() {
	return "MovieShow [showDate=" + showDate + ", movieShowInfo=" + Arrays.toString(movieShowInfo) + "]";
}
}
