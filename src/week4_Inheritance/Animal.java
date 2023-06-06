package week4_Inheritance;

public class Animal {
    private boolean food;
    private boolean water;
    private boolean heart;

    public Animal(boolean Food, boolean Water, boolean Heart){
        food = Food;
        water = Water;
        heart = Heart;
    }

    public boolean getFood(){
        return food;
    }

    public boolean getWater(){
        return water;
    }

    public boolean getHeart(){
        return heart;
    }
}
