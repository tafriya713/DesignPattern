package AbstractDP;
import java.util.ArrayList;
import java.util.List;
abstract class Pizza {
    protected List<String> toppings = new ArrayList<>();

    public void addTopping(String topping) {
        toppings.add(topping);
    }
    public void printToppings() {
        System.out.println("Toppings:");
        for (String topping : toppings) {
            System.out.println("- " + topping);
        }
    }
}
