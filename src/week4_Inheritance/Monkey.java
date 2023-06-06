package week4_Inheritance;

public class Monkey extends Mammals{
    private boolean Climb;

    public Monkey(boolean food, boolean water, boolean heart, boolean lays_Eggs, boolean ClimbTrees){
        super(food, water, heart, lays_Eggs);
        Climb = ClimbTrees;
    }

    public boolean getClimb(){
        return Climb;
    }
}
