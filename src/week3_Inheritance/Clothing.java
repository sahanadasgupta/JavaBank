package week3_Inheritance;

public class Clothing {
    private String size;
    private String color;

    public Clothing(String ClothingSize, String ClothingColor){
        System.out.println("Color + size ");
        size = ClothingSize;
        color = ClothingColor;
    }
    public Clothing(String ClothingSize ){
        System.out.println("size");
        size = ClothingSize;
        color = "white";
    }

    public String getSize(){
        return size;
    }

    public String getColor(){
        return color;
    }
}
