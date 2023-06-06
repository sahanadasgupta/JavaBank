package week4_Inheritance;

public class Pig extends Mammals{
    private boolean Snort;

    public Pig(boolean food, boolean water, boolean heart, boolean laysEggs, boolean DoesSnort){
        super(food, water, heart, laysEggs);
        Snort = DoesSnort;
    }

    public boolean getSnort(){
        return Snort;
    }
}
