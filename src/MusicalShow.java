import java.util.ArrayList;

public class MusicalShow extends Show {

    protected Person musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, int duration, Director director, ArrayList<Actor> actors,
                       Person musicAuthor, String librettoText) { // Здесь тоже Person
        super(title, duration, director, actors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println("Либретто «" + title + "»: " + librettoText);
    }


    public Person getMusicAuthor() {
        return musicAuthor;
    }
}