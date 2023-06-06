package week5_Polymorphism;

public abstract class Solid {
    String name;
    double volume, surfaceArea;
    int length, width, height;

    public Solid(String Name, int Length, int Width, int Height){
        name = Name;
        length = Length;
        width = Width;
        height = Height;
    }

    public String getName(){
        return name;
    }

    public double getVolume(){
        return volume;
    }

    public double getSurfaceArea(){
        return surfaceArea;
    }
}
