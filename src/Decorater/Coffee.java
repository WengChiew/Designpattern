package Decorater;

public class Coffee implements CoffeDrink {

    private double price;

    public Coffee(double price){
        this.price = price;
    }

    @Override
    public double getPrice(){
        return this.price;
    }

    @Override
    public String getIngredients() {
        return "Coffee";
    }

    @Override
    public void prepare() {
        System.out.println("PREPARE FOR " + getIngredients());
    }
}
