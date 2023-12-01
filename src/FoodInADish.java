public class FoodInADish <T> extends DrawableObj implements Comparable <FoodInADish<T>>{
    T food;
    String dishColor;

    public FoodInADish(){
        this.food = (T) "";
        this.dishColor = "";
    }

    public FoodInADish(T food, String dishColor) {
        this.food = food;
        this.dishColor = dishColor;
    }

    public T getFood() {
        return food;
    }

    public void setFood(T food) {
        this.food = food;
    }

    public String getDishColor() {
        return dishColor;
    }

    public void setDishColor(String dishColor) {
        this.dishColor = dishColor;
    }


    @Override
    public String toString() {
        return "A " + food + " in a " + dishColor + " dish";
    }

    @Override
    public int compareTo(FoodInADish<T> o) {
        if (food.getClass() == o.getFood().getClass()){
            return compareDouble(((Food)food).getKg(),(((Food)o.getFood()).getKg()));
        }
        if(food instanceof Fruit){
            return 0;
        }
        return 1;
    }

    private int compareDouble(double kg, double kg1) {
        if (kg<kg1){
            return -1;
        }
        else if(kg==kg1){
            return 0;
        }
        return 1;
    }


}