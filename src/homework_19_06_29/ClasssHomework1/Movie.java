package homework_19_06_29.ClasssHomework1;

public class Movie {

    private static int counter;

    private String name;
    private String actorName;
    private int year;
    private MovieGenre movieGenre;// (Comedy, Drama, Fantasy, Horror)
    private float imdbScore;//  (1.00 - 10.00), default 5.00
    private double ticketPrice; //, default 2 (dollars)

    private int privateCounter;

    public Movie(String name,
                 String actorName,
                 int year,
                 MovieGenre movieGenre) {
        this.name = name;
        this.actorName = actorName;
        this.year = year;
        this.movieGenre = movieGenre;

        imdbScore = 5;
        //this.imdbScore = 5;

        ticketPrice = 2;

        counter++;
        privateCounter = counter;
    }

    public int getPrivateCounter() {
        return privateCounter;
    }

    // not a good practice
    public int getCounter() {
        return counter;
    }

    public static int getCounterStatic() {
        return counter;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", actorName='" + actorName + '\'' +
                ", year=" + year +
                ", movieGenre=" + movieGenre +
                ", imdbScore=" + imdbScore +
                ", ticketPrice=" + ticketPrice +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public MovieGenre getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(MovieGenre movieGenre) {
        this.movieGenre = movieGenre;
    }

    public float getImdbScore() {
        return imdbScore;
    }

    public void setImdbScore(float imdbScore) {
        this.imdbScore = imdbScore;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void increaseImdbScore(float amount){
        imdbScore += amount;
    }
}
