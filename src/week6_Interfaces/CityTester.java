package week6_Interfaces;

public class CityTester {
    public static void main(String[] args) {
        City boston1 = new City(856700);
        City boston2 = new City(657988);
        System.out.println(boston1.add(boston2));
    }
}
