public class Food {
    String name;
    double kg;

    public Food(){
        this.name = "";
        this.kg = 0.00;
    }

    public Food(String name, double kg) {
        this.name = name;
        this.kg = kg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    @Override
    public String toString() {
        return name;
    }
}
