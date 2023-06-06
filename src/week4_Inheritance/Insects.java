package week4_Inheritance;

public class Insects extends Animal{
    private boolean Thorax;

    public Insects(boolean food, boolean water, boolean heart, boolean hasThorax){
        super(food, water, heart);
        Thorax = hasThorax;
    }

    public boolean getThorax(){
        return Thorax;
    }
}
