package week4_Inheritance;

public class Ant extends Insects{
    private boolean Antennae;

    public Ant(boolean food, boolean water, boolean heart, boolean hasThorax, boolean HasAntennae){
        super(food, water, heart, hasThorax);
        Antennae = HasAntennae;
    }

    public boolean getAntennae(){
        return Antennae;
    }
}
