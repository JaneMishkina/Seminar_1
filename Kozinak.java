public class Kozinak extends Product {
    double calories;
    public double getCalories() {
        return calories;
    }
    public void setCalories(double calories) {
        this.calories = calories;
    }
    private double weight;
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void checkWeight(double weight){
        if (weight <= 0){
            this.weight = 10;
        }
        else {
            this.weight = weight;
        }
    }
    public Kozinak(String name, double price, double calories, double weight) {
        super(name, price);
        this.calories = calories;
        this.weight = weight;
    }
    @Override
    public String displayInfo() {
        return String.format("%s - %f - калорийностью %f ккал - массой %f грамм", name, price, calories, weight);
    }
}
