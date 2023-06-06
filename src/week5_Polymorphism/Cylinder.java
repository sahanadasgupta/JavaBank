package week5_Polymorphism;

public class Cylinder extends Solid{
    private double radius;

    public Cylinder(String Name, int Width, int Length, int Height, double Radius){
        super(Name, Length, Width, Height);
        radius = Radius;
    }

    public double getVolume(){
        volume = (3.14 * radius * radius * height);
        return volume;
    }

    public double getSurfaceArea(){
        surfaceArea = ((2 * 3.14 * radius * height) + (2 * 3.14 * radius * radius));
        return surfaceArea;
    }
}
