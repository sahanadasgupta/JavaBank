package week4_Inheritance;

public class FieldSpaniel extends Spaniel{
    private boolean Undercoat;

    public FieldSpaniel(boolean food, boolean water, boolean heart, boolean laysEggs, boolean DoesBark, boolean HasDroopyEars, boolean HasUndercoat){
        super(food, water, heart, laysEggs, DoesBark, HasDroopyEars);
        Undercoat = HasUndercoat;
    }

    public boolean getUndercoat(){
        return Undercoat;
    }
}
