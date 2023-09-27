package Decorater;

public abstract class CoffeeDecorator implements CoffeDrink{

    private CoffeDrink drink;
    public CoffeeDecorator(CoffeDrink drink){
        this.drink = drink;

    }


    public double getPrice(){
        return drink.getPrice();
    }

    public String getIngredients(){
        return drink.getIngredients();
    }

    public void prepare(){
        drink.prepare();
    }

}
