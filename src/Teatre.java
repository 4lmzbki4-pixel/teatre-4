import java.util.ArrayList;

public class Teatre {
    public static void main(String[] args) {


        Actor a1 = new Actor("Александр", "Кайдановский", Gender.MALE, 177.0);
        Actor a2 = new Actor("Мэттью", "Макконахи", Gender.MALE, 184.0);
        Actor a3 = new Actor("Энн", "Хэтэуэй", Gender.FEMALE, 175.0);

        Director d1 = new Director("Андрей", "Тарковский", Gender.MALE, 50);
        Director d2 = new Director("Кристофер", "Нолан", Gender.MALE, 45);

        Person composerZimmer = new Person("Ханс", "Зиммер", Gender.MALE);
        Person composerEinaudi = new Person("Людовико", "Ейнауди", Gender.MALE);
        Person choreographer = new Person("Питер", "Паркер", Gender.MALE);


        Show drama = new Show("Интерстеллар", 180, d1, new ArrayList<>());

        Opera opera = new Opera("Экспириенс", 210, d2, new ArrayList<>(),
                composerEinaudi, "История Пианиста", 40);

        Ballet ballet = new Ballet("Абстрактное озеро", 140, d1, new ArrayList<>(),
                composerZimmer, "Путешествие за горизонт событий в поисках любви", choreographer);


        drama.addActor(a1);
        drama.addActor(a3);
        opera.addActor(a2);
        opera.addActor(a1);
        ballet.addActor(a2);
        ballet.addActor(a3);


        System.out.println("\n--- АФИША ТЕАТРА: СИНТЕЗ ИСКУССТВ ---");
        drama.printActorsList();
        System.out.println();
        opera.printActorsList();
        System.out.println();
        ballet.printActorsList();


        System.out.println("\n--- ИНФОРМАЦИЯ О РЕЖИССЕРЕ ---");
        drama.printDirectorInfo();


        System.out.println("\n--- ПРОИЗВОДИМ ЗАМЕНУ ---");
        System.out.println("В спектакле «Интерстеллар» заменяем Александра на Макконахи:");
        drama.replaceActor(a2, "Кайдановский");
        drama.printActorsList();

        System.out.println("\n--- ТЕСТ ОШИБКИ ЗАМЕНЫ ---");
        opera.replaceActor(a3, "Райан Гослинг");

        System.out.println("\n--- ТЕКСТЫ ЛИБРЕТТО ---");
        opera.printLibretto();
        ballet.printLibretto();

        System.out.println("\nПредставление окончено! Не забудьте выключить свет:)! Занавес.");
    }
}