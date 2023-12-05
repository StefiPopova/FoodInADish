import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {

    public static void main(String[] args) throws IOException {

        JFrame frame = new JFrame();
        frame.setTitle("Food in a dish");
        frame.setSize(1800,200);
        frame.setLayout(null);
        JPanel allPnl = new JPanel();

        List<FoodInADish<Food>> foods = new ArrayList<FoodInADish<Food>>();
        foods.add(new FoodInADish<Food>(new Fruit("blueberry", 0.091, true),"green"));
        foods.add(new FoodInADish<Food>(new Fruit("banana", 0.410, true),"blue"));
        foods.add(new FoodInADish<Food>(new Vegetable("pepper", 0.243, true),"dark blue"));
        foods.add(new FoodInADish<Food>(new Fruit("strawberry", 0.100, true),"blue"));
        foods.add(new FoodInADish<Food>(new Vegetable("lettuce", 0.324, true),"yellow"));




                }

}



