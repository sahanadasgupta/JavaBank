package week5_Polymorphism;

public class Sphere extends Solid {
    private double radius;

    public Sphere(String Name, int Length, int Width, int Height, double Radius){
        super(Name, Length, Width, Height);
        radius = Radius;
    }

    public double getVolume(){
        volume = (3.14 * radius * radius * radius * (4/3));
        return volume;
    }

    public double getSurfaceArea(){
        surfaceArea = (4 * 3.14 * radius * radius);
        return surfaceArea;
    }
}
