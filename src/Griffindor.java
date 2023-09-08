public class Griffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, int energy, int transgration, int nobility, int honor, int bravery) {
        super(name, energy, transgration);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public static void studentComparison(Griffindor student1, Griffindor student2) {
        int sum1 = student1.getBravery() + student1.getNobility() + student1.getHonor();
        int sum2 = student2.getBravery() + student2.getNobility() + student2.getHonor();
        if (sum1 > sum2) {
            System.out.println("Студент " + student1.getName() +
                    " лучший Гриффиндорец, чем " + student2.getName());
        } else {
            System.out.println("Студент " + student2.getName() +
                    " лучший Гриффиндорец, чем " + student1.getName());
        }
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "Griffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                ", energy=" + energy +
                ", transgration=" + transgration +
                '}';
    }
}
