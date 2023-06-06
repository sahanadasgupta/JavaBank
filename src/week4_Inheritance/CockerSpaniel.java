package week4_Inheritance;

public class CockerSpaniel extends Spaniel{
    private boolean Hunt;

    public CockerSpaniel(boolean food, boolean water, boolean heart, boolean laysEggs, boolean DoesBark, boolean HasDroopyEars, boolean BredtoHunt){
        super(food, water, heart, laysEggs, DoesBark, HasDroopyEars);
        Hunt = BredtoHunt;
    }

    public boolean getHunt(){
        return Hunt;
    }
}
