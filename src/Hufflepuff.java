public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int energy, int transgration, int industriousness, int loyalty, int honesty) {
        super(name, energy, transgration);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public static void studentComparison(Hufflepuff student1, Hufflepuff student2) {
        int sum1 = student1.getIndustriousness() + student1.getLoyalty() + student1.getHonesty();
        int sum2 = student2.getIndustriousness() + student2.getLoyalty() + student2.getHonesty();
        if (sum1 > sum2) {
            System.out.println("Студент " + student1.getName() +
                    " лучший Пуффендуец, чем " + student2.getName());
        } else {
            System.out.println("Студент " + student2.getName() +
                    " лучший Пуффендуец, чем " + student1.getName());
        }
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                ", energy=" + energy +
                ", transgration=" + transgration +
                '}';
    }
}
