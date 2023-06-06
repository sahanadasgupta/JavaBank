package week5_Polymorphism;

public class Cube extends Solid{

    public Cube(String Name, int Length, int Width, int Height){
        super(Name, Length, Width, Height);
    }

    public double getVolume(){
        volume = length * width * height;
        return volume;
    }

    public double getSurfaceArea(){
        surfaceArea = 6 * length * length;
        return surfaceArea;
    }
}
