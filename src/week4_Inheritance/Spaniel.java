package week4_Inheritance;

public class Spaniel extends Dogs{
    private boolean DroopyEars;

    public Spaniel(boolean food, boolean water, boolean heart, boolean laysEggs, boolean DoesBark, boolean HasDroopyEars){
        super(food, water, heart, laysEggs, DoesBark);
        DroopyEars = HasDroopyEars;
    }

    public boolean getDroopyEars(){
        return DroopyEars;
    }
}
