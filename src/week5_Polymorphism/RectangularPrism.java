package week5_Polymorphism;

public class RectangularPrism extends Cube {

    public RectangularPrism(String Name, int Length, int Width, int Height){
        super(Name, Length, Width, Height);
    }

    public double getVolume(){
        volume = width * length * height;
        return volume;
    }

    public double getSurfaceArea(){
        surfaceArea = (2*(width * length) + (height * length) + (height * width));
        return surfaceArea;
    }
}
