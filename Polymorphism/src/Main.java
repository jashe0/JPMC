import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Movie theMovie = Movie.getMovie("Science Fiction","Star Wars");
        // theMovie.watchMovie();

        Scanner s = new Scanner(System.in);

        while(true){
            System.out.println("Enter type (A for Adventure, C for Comedy or S for Science Fiction or press " +
                    "Q to quit)");
            String type =  s.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.println("Enter movie title");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type,title);
            movie.watchMovie();
        }

    }
}
