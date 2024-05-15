package AbstractDP;

public class Main {
    public static void main(String[] args) {
        ItalianPizza itelian = new ItalianPizza();
        PepperoniPizza pepperoni = new PepperoniPizza();
        System.out.println("Itelian Pizza:");
        itelian.printToppings();
        System.out.println("Pepperoni Pizza:");
        pepperoni.printToppings();
    }
    }


