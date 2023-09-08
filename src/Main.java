public class Main {
    public static void main(String[] args) {
                Griffindor harryPotter = new Griffindor ( "Гарри Поттер", 88,92,35,46,82);
                Griffindor hermioneGranger = new Griffindor ("Гермиона грейнджер", 85,43,72,12,84);
                Griffindor ronWeasley = new Griffindor ("Рон Уизли", 43,52,73,71,64 );
                Hufflepuff zachariasSmith = new Hufflepuff ("Захария Смит", 81,31,21,41,11);
                Hufflepuff cedricDiggory = new Hufflepuff ("Седрик Диггори",42,22,32,12,72);
                Hufflepuff justinFinchFletchley = new Hufflepuff ("Джастин Финч-Флетчли",83,63,43,23,63);
                Ravenclaw zhouChang = new Ravenclaw ("Чжоу Чанг", 61,42,73,81,42,53);
                Ravenclaw padmaPatil = new Ravenclaw ("Падма Патил", 92,73,54,31,21,41);
                Ravenclaw marcusBelby = new Ravenclaw ("Маркус Белби", 23,41,51,62,32,71);
                Slytherin dracoMalfoy = new Slytherin ("Драко Малфой",72,53,33,51,71,51,83);
                Slytherin grahamMontagu = new Slytherin ("Грэхэм Монтегю",71,22,51,31,43,61,12);
                Slytherin gregoryGoyl = new Slytherin ("Грегори Гойл", 32,24,51,61,51,71,41);

        ronWeasley.compareWith(gregoryGoyl);

    }
}