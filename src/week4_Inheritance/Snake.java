package week4_Inheritance;

public class Snake extends Reptiles{
    private boolean Venom;

    public Snake(boolean food, boolean water, boolean heart, boolean isColdBlooded, boolean HasVenom){
        super(food, water, heart, isColdBlooded);
        Venom = HasVenom;
    }

    public boolean getVenom(){
        return Venom;
    }
}
