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

        Object unknownObject = Movie.getMovie("Science Fiction","Alien");
        if(unknownObject.getClass().getSimpleName() == "Comedy"){
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof  Adventure){
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction syfy){
            syfy.watchScienceFiction();
        }
    }
}
