package sorting.movietime;

public class Show {
    String movieName;
    int time; // time in minutes from 00:00 (e.g. 10:30 → 630)

    public Show(String movieName, int time) {
        this.movieName = movieName;
        this.time = time;
    }

    @Override
    public String toString() {
        int hours = time / 60;
        int minutes = time % 60;
        return movieName + " - " +
               String.format("%02d:%02d", hours, minutes);
    }
}
