package week5_Polymorphism;

public class SolidTester {
    public static void main(String[] args) {
        Solid Cube1 = new Cube("Betty", 5, 5, 5);
        System.out.println(Cube1.getName());
        System.out.println(Cube1.getVolume());
        System.out.println(Cube1.getSurfaceArea());
    }
}
