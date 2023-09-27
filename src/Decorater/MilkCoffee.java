package Decorater;

public class MilkCoffee extends CoffeeDecorator{


    private double price;

    public MilkCoffee(CoffeDrink drink, double price){
        super(drink);
        this.price = price;
    }

    public double getPrice(){
        return super.getPrice() + this.price;
    }

    public String getIngredients(){
        return super.getIngredients() + " MILKK";
    }

    public void prepare(){
        heatMlik();
        super.prepare();
    }

    public void heatMlik(){
        System.out.println("Heating the milk");
    }
}
