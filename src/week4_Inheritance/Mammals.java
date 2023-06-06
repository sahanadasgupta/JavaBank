package week4_Inheritance;

public class Mammals extends Animal{
    private boolean Eggs;

    public Mammals(boolean food, boolean water, boolean heart, boolean lays_Eggs){
        super(food, water, heart);
        Eggs = lays_Eggs;
    }

    public boolean getEggs(){
        return Eggs;
    }
}
