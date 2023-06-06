package week4_Inheritance;

public class Bee extends Insects{
    private boolean Stinger;

    public Bee(boolean food, boolean water, boolean heart, boolean hasThorax, boolean HasStinger){
        super(food, water, heart, hasThorax);
        Stinger = HasStinger;
    }

    public boolean getStinger(){
        return Stinger;
    }
}
