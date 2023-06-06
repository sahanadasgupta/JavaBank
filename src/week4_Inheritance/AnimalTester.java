package week4_Inheritance;

public class AnimalTester {
    public static void main(String[] args) {
        System.out.println(Animal.class.getSuperclass().getName());
        Dogs apollo = new Dogs(true, true, true, false, true);
        System.out.println(apollo.getFood());
        System.out.println(apollo.getWater());
        System.out.println(apollo.getHeart());
        System.out.println(apollo.getEggs());
        System.out.println(apollo.getBarks());
    }
}
