package week9_ArrayLists;

public class RoadTripTester {
    public static void main(String[] args) {

        RoadTrip rt = new RoadTrip();

        System.out.println(rt);

        System.out.println("Stops: " + rt.getNumberOfStops());
        System.out.println("Total Miles: " + rt.getTripLength());
    }
}
