package week9_ArrayLists;
import java.util.*;
public class RoadTrip{
    int i = 0;
    private ArrayList<GeoLocation> place;
    public RoadTrip(){
        place = new ArrayList<GeoLocation>();
    }

    public void addStop(GeoLocation g){
        place.add(g);
        i++;
    }

    public int getNumberOfStops(){
        return i;
    }

    public double getTripLength(){
        double sum = 0;
        GeoLocation p1 = place.get(0);
        for (int i = 1; i < place.toArray().length; i++){
            sum = sum + place.get(i).distanceFrom(p1);}
        return sum;
    }
}
