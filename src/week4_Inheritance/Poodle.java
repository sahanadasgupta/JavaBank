package week4_Inheritance;

public class Poodle extends Dogs{
    private boolean LongNeck;

    public Poodle(boolean food, boolean water, boolean heart, boolean laysEggs, boolean DoesBark, boolean HasLongNeck){
        super(food, water, heart, laysEggs, DoesBark);
        LongNeck = HasLongNeck;
    }

    public boolean getLongNeck(){
        return LongNeck;
    }
}
