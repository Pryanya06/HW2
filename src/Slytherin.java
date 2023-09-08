public class Slytherin extends Hogwarts {

    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int power;

    public Slytherin(String name, int energy, int transgration, int trick, int determination, int ambition, int resourcefulness, int power) {
        super(name, energy, transgration);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }

    public static void studentComparison(Slytherin student1, Slytherin student2) {
        int sum1 = student1.getTrick() + student1.getDetermination() + student1.getAmbition()
                + student1.getResourcefulness() + student1.getPower();
        int sum2 = student2.getTrick() + student2.getDetermination() + student2.getAmbition()
                + student2.getResourcefulness() + student2.getPower();
        if (sum1 > sum2) {
            System.out.println("Студент " + student1.getName() +
                    " лучший Слизеринец, чем " + student2.getName());
        } else {
            System.out.println("Студент " + student2.getName() +
                    " лучший Слизеринец, чем " + student1.getName());
        }
    }

    public int getTrick() {
        return trick;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "trick=" + trick +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", power=" + power +
                ", energy=" + energy +
                ", transgration=" + transgration +
                '}';
    }
}
