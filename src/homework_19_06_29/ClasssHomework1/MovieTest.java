package homework_19_06_29.ClasssHomework1;


import static homework_19_06_29.ClasssHomework1.MovieGenre.*;

public class MovieTest {

    public static void main(String[] args) {
        // Venom, Tom Hardy , Sci-Fi, 2017, 9.2, 5$
        Movie venom = new Movie(
                "Venom",
                "Tom Hardy",
                2017,
                SCI_FI);
        venom.setImdbScore(9.2f);
        venom.setTicketPrice(5);

        //Bohemian Rhapsody, Rami Malek, Drama, 2018, 10, 6$
        Movie bohemianRhapsody = new Movie(
                "Bohemian Rhapsody",
                "Rami Malek",
                2018,
                DRAMA);
        bohemianRhapsody.setImdbScore(10);
        bohemianRhapsody.setTicketPrice(6);

        //The Hustle, Anne Hathaway, Comedy, 2018 , 5.3, 3$
        Movie hustle = new Movie(
                "The Hustle",
                "Anne Hathaway",
                2018,
                COMEDY);
        hustle.setImdbScore(5.3f);
        hustle.setTicketPrice(3);

        // decrease IMDB  with 2.5
        venom.setImdbScore(venom.getImdbScore() - 2.5f);
        venom.setYear(venom.getYear() + 1);

        bohemianRhapsody.increaseImdbScore(-2.5f);

        System.out.println(venom);
        System.out.println(bohemianRhapsody);
        System.out.println(hustle);

        // the wrong way
        System.out.println("Venom counter: " + venom.getCounter());
        System.out.println("BohemianRhapsody counter: " + bohemianRhapsody.getCounter());
        System.out.println("The hustle counter: " + hustle.getCounter());

        System.out.println("Total movies: " + Movie.getCounterStatic());
        // the correct way
        System.out.println("Venom counter: " + venom.getPrivateCounter());
        System.out.println("BohemianRhapsody counter: " + bohemianRhapsody.getPrivateCounter());
        System.out.println("The hustle counter: " + hustle.getPrivateCounter());

        Movie[] movies = new Movie[]{
                venom,
                bohemianRhapsody,
                hustle
        };

        System.out.print("\nMovie names:");
        printMoviesNames(movies);

        System.out.print("\nMovie IMDB average: "
            + getAverageImdb(movies));

        System.out.println();
        System.out.print("\nMovie IMDB average: "
                + getAverageImdb(new Movie[0]));
    }

    private static void printMoviesNames(Movie[] moviesArray) {
        //String[] movieNames = new String[moviesArray.length];
/*        for (int i = 0; i < moviesArray.length; i++) {
            System.out.print(" " + moviesArray[i].getName() + ",");
            //movieNames[i] = moviesArray[i].getName();
        }*/

        for (Movie currentMovie : moviesArray){
            System.out.print(" " + currentMovie.getName() + ",");
        }
    }

    private static float getAverageImdb(Movie[] movies) {
        if(movies.length == 0) {
            //return 0;
            throw new RuntimeException("no movies!!!");
        }

        float sum = 0;
        for(Movie currentMovie : movies){
            sum += currentMovie.getImdbScore();
        }

        return sum / movies.length;
    }
}
