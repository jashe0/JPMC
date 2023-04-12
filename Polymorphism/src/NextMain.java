public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("Adventure","Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("Adventure","Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("Comedy","Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("Comedy","Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();
    }
}
