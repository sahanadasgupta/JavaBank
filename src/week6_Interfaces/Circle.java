package week6_Interfaces;

public class Circle {
    private double radius;

    public Circle(double Radius){
        radius = Radius;
    }

    public double getRadius(){
        return radius;
    }

    public int compareTo(Circle other){
        double diff = getRadius() - other.getRadius();
        return (int)Math.signum(diff);
    }
}
