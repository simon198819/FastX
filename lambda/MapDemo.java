import java.util.*;
public class MapDemo
{
    public static void main(String[]args)
    {
        List<Integer> arList=new ArrayList<Integer>();
        arList.add(34);
        arList.add(15);
        arList.add(53);
        arList.add(44);

        Stream s = arList.stream().Map(i ->i*i).forEach(x -> System.out.println(x));
        
    }
}