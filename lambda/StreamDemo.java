import java.util.*;
public class StreamDemo
{
    public static void main(String[]args)
    {
        List<Integer> arList =new ArrayList<Integer>();
        arList.add(15);
        arList.add(25);
        arList.add(5);
        List<Integer> newAl =new ArrayList<Integer>();

        newAl=arList.stream().filter(x -> x>=15).collect (Collectors.toList());
        newAl.stream().forEach(x -> System.out.println(x));
    }
}