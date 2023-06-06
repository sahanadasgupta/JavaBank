package week4_Inheritance;

public class Dogs extends Mammals{
    private boolean Barks;

    public Dogs(boolean food, boolean water, boolean heart, boolean laysEggs, boolean DoesBark){
        super(food, water, heart, laysEggs);
        Barks = DoesBark;
    }

    public boolean getBarks(){
        return Barks;
    }
}
