package week3_Inheritance;

public class Sweatshirt extends Clothing{
    private boolean hood;
    private boolean yesORno;
    private boolean has_Hood;

    public Sweatshirt(String size, String color, boolean HasHood) {
        super(size, color);
    }

    public boolean HasHood(boolean trueORfalse) {
        yesORno = trueORfalse;
        if (yesORno = true)
            has_Hood = true;
        else if (yesORno = false)
            has_Hood = false;
    return has_Hood;}

    public boolean getHasHood(){
        return has_Hood;
    }
}
