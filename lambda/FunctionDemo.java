import java.util.function.Function;

public class FunctionDemo
{
    public static void main(String[]args)
    {
        Function<Integer,Integer> squareMe =i->i*i;
        System.out.println("Square of 5 is" + squareMe.apply(5));
    }
}