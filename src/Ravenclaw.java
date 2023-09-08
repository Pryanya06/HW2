public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int energy, int transgration, int mind, int wisdom, int wit, int creativity) {
        super(name, energy, transgration);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public static void studentComparison(Ravenclaw student1, Ravenclaw student2) {
        int sum1 = student1.getMind() + student1.getWisdom() + student1.getWit() +
                student1.getCreativity();
        int sum2 = student2.getMind() + student2.getWisdom() + student2.getWit() +
                student2.getCreativity();
        if (sum1 > sum2) {
            System.out.println("Студент " + student1.getName() +
                    " лучший Когтевранец, чем " + student2.getName());
        } else {
            System.out.println("Студент " + student2.getName() +
                    " лучший Когтевранец, чем " + student1.getName());
        }
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                ", energy=" + energy +
                ", transgration=" + transgration +
                '}';
    }
}
