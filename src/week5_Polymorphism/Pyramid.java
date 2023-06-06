package week5_Polymorphism;

import sun.java2d.Surface;

public class Pyramid extends Solid{
    private double slantHeight;

    public Pyramid(String Name, int Length, int Width, int Height, double SlantHeight){
        super(Name, Length, Width, Height);
        slantHeight = SlantHeight;
    }

    public double getVolume(){
        volume = ((length * width * height) / 3);
        return volume;
    }

    public double getSurfaceArea(){
        surfaceArea = ((length * width) + (length * slantHeight) + (width * slantHeight));
        return surfaceArea;
    }
}
