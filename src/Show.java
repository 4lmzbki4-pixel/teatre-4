import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void addActor(Actor newActor) {
        if (listOfActors.contains(newActor)) {
            System.out.println("Предупреждение: " + newActor + " уже в составе!");
        } else {
            listOfActors.add(newActor);
        }
    }

    public void replaceActor(Actor newActor, String oldSurname) {
        int count = 0;
        int indexToReplace = -1;


        for (int i = 0; i < listOfActors.size(); i++) {

            if (listOfActors.get(i).getSurname().equals(oldSurname)) {
                count++;
                indexToReplace = i;
            }
        }

        if (count == 1) {
            listOfActors.set(indexToReplace, newActor);

            System.out.println("Актер с фамилией " + oldSurname + " успешно заменен.");
        } else if (count > 1) {
            System.out.println("Ошибка: в спектакле «" + title + "» найдено несколько актеров с фамилией " + oldSurname + ". Замена невозможна.");
        } else {
            System.out.println("Ошибка: актер с фамилией " + oldSurname + " не найден.");
        }
    }

    public void printActorsList() {
        System.out.println("Актеры спектакля «" + title + "»:");
        for (Actor a : listOfActors) System.out.println("- " + a);
    }

    public void printDirectorInfo() {
        if (director != null) {
            System.out.println("Режиссер спектакля «" + title + "»:");
            System.out.println("ФИО: " + director);
            System.out.println("Количество постановок: " + director.getNumberOfShows());
        } else {
            System.out.println("Режиссер для спектакля «" + title + "» не назначен.");
        }
    }
}

