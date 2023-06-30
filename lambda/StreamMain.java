import java.util.ArrayList;
import java.util.List;

public class StreamMain
{
    static List<String> places=new ArrayList<>();
    public static List getPlaces()
    {
    places.add("Nepal, Kathmandu");
    places.add("India, Delhi");
    places.add("Iran, Tehran");
    places.add("America,New York");

    return places;
    }
    public static void main(String[]args)
    {
        List<String> myPlaces =getPlaces();
        System.out.println("Place From India:");

        myPlaces.stream()
        .filter((p) -> p.startsWith("India"))
        .map((p) -> p.toUpperCase())
        .sorted()
        .forEach((p) -> System.out.println(p));
    }
}