package sorting.cinemalhouse;

public class MovieShow {
    String movieName;
    int showTime; // 24-hour format, e.g. 1430 for 2:30 PM

    public MovieShow(String movieName, int showTime) {
        this.movieName = movieName;
        this.showTime = showTime;
    }
}
