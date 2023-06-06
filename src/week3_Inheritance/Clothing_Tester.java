package week3_Inheritance;

public class Clothing_Tester {
    public static void main(String[] args) {
        System.out.println(Clothing.class.getSuperclass().getName());
        Sweatshirt s = new Sweatshirt("small", "red", true);
        System.out.println(s.getColor());
        System.out.println(s.getSize());
        System.out.println(s.getHasHood());
        Tshirt s1 = new Tshirt("small", "red");
        System.out.println(s1.getColor());
        System.out.println(s1.getSize());
        //System.out.println(s.getHasHood());
    }
}
