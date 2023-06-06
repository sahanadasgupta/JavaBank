package week4_Inheritance;

public class Turtle extends Reptiles{
    private boolean Shell;

    public Turtle(boolean food, boolean water, boolean heart, boolean isColdBlooded, boolean HasShell){
        super(food, water, heart, isColdBlooded);
        Shell = HasShell;
    }

    public boolean getShell(){
        return Shell;
    }
}
