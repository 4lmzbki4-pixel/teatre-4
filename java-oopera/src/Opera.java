import java.util.ArrayList;

public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title, int duration, Director d, ArrayList<Actor> a,
                 Person m, String l, int size) {
        super(title, duration, d, a, m, l);
        this.choirSize = size;
    }

    @Override
    public void printActorsList() {
        System.out.println("Опера «" + title + "»");
        System.out.println("Композитор: " + musicAuthor);
        System.out.println("Размер хора: " + choirSize);
        System.out.println("Актеры:");
        for (Actor a : listOfActors) {
            System.out.println("- " + a);
        }
    }
}