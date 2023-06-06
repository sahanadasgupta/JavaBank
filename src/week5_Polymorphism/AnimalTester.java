package week5_Polymorphism;

public class AnimalTester {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cow = new Cow();
        Animal pig = new Pig();

        dog.talk();
        cow.talk();
        pig.talk();
    }}

