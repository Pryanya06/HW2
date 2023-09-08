public class Hogwarts {

    protected String name;
    protected int energy;
    protected int transgration;

    public Hogwarts(String name, int energy, int transgration) {
        this.name = name;
        this.energy = energy;
        this.transgration = transgration;

    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public int getTransgration() {
        return transgration;
    }

    public void studentDescription() {
        System.out.println("Имя - " + name + ", energy " + getEnergy() +
                ", transgration " + getTransgration());
    }

    private int energyCompare(Hogwarts student) {
        return energy - student.getEnergy();
    }

    private int transgrationCompare(Hogwarts student) {
        return transgration - student.getTransgration();
    }


    public void compareWith(Hogwarts student) {
        int energyComparison =  energyCompare(student);
        int transgressionComparison = transgrationCompare (student);
        if (energyComparison > 0) {
            System.out.println(getName() + " обладает большей мощностью магии, чем " + student.getName());
        } else {
            System.out.println(student.getName() + " обладает большей мощностью магии, чем " + getName());
        }
        if (transgressionComparison > 0) {
            System.out.println(getName() + " обладает большей дальностью трансгрессии, чем " + student.getName());
        } else {
            System.out.println(student.getName() + " обладает большей дальностью трансгрессии, чем " + getName());
        }
        if (energyComparison == 0) {
            System.out.println(getName() + " сопоставим по силе магии с " + student.getName());
        } else if (transgressionComparison == 0) {
            System.out.println(getName() + " сопоставим по силе трансгресии c " + student.getName());

        }
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", energy=" + energy +
                ", transgration=" + transgration +
                '}';
    }
}
