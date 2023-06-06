package week4_Inheritance;

public class Reptiles extends Animal{
    private boolean ColdBlooded;

    public Reptiles(boolean food, boolean water, boolean heart, boolean isColdBlooded){
        super(food, water, heart);
        ColdBlooded = isColdBlooded;
    }

    public boolean getColdBlooded(){
        return ColdBlooded;
    }
}
