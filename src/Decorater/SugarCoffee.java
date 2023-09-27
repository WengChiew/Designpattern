package Decorater;

public class SugarCoffee extends CoffeeDecorator{


    private double price;

    public SugarCoffee(CoffeDrink drink, double price) {
        super(drink);
        this.price = price;
    }

    public double getPrice(){
        return super.getPrice() + this.price;
    }

    public String getIngredients(){
        return super.getIngredients() + " Some sugaaar";
    }

    public void prepare(){
        System.out.println("Adding some sugar");
        super.prepare();
    }

}
