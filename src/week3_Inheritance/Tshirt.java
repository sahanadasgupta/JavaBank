package week3_Inheritance;

public class Tshirt extends Clothing{
    private String Fabric;

    public Tshirt(String size, String fabric){
        super (size);
        Fabric = fabric;
    }

    public String getFabric(){
        return Fabric;
    }
}
