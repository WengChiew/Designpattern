package Decorater;

public class Main {
    public static void main(String[] args) {

        CoffeDrink coffee = new Coffee(12.1);
        CoffeDrink milkCoffee = new MilkCoffee(coffee, 1.2);
        //System.out.println(milkCoffee.getPrice());
        //milkCoffee.prepare();
        CoffeDrink sugarCoffee = new SugarCoffee(milkCoffee, 0.3);
        System.out.println(sugarCoffee.getPrice());
        sugarCoffee.prepare();
        System.out.println(sugarCoffee.getIngredients());
    }
}