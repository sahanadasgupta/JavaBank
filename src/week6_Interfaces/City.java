package week6_Interfaces;

public class City{
    int curr_Pop;

    public City(int Curr_Pop){
        curr_Pop = Curr_Pop;
    }

    public interface Summable{
        public int add(City other);
        public int getValue();
    }

    public int getValue(){
        return curr_Pop;
    }

    public int add(City other){
        return getValue() + other.getValue();
    }
}
