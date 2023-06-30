
import java.util.*;
public class LembdaExpression7
{
public static void main(String[]args)
{
    List<String>list=new ArrayList<>();
    list.add("Mayank");
    list.add("Rahul");
    list.add("Pawan");
    list.add("Rahman");
    list.add("Etan Hunt");
    list.add("Kraven The Hunter");

    listforEach(
        (n)->System.out.println(n));
    
}
}