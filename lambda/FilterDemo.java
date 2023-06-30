import java.util.*;
public class FilterDemo
{
    public static void main(String[]args)
    {
        List<Integer> arList=new ArrayList<Integer>();
        arList.add(34);
        arList.add(15);
        arList.add(53);
        arList.add(44);

        Stream s = arList.stream().filter(i ->i%2 == 0);
        s.forEach(x -> System.out.println(x));
    }
}