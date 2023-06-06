package week4_Inheritance;

public class SpringerSpaniel extends Spaniel{
    private boolean WeatherTolerance;

    public SpringerSpaniel(boolean food, boolean water, boolean heart, boolean laysEggs, boolean DoesBark, boolean HasDroopyEars, boolean HasWeatherTolerance){
        super(food, water, heart, laysEggs, DoesBark, HasDroopyEars);
        WeatherTolerance = HasWeatherTolerance;
    }

    public boolean getWeatherTolerance(){
        return WeatherTolerance;
    }
}
