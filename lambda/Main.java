
import java.lang.FunctionalInterface;

@FunctionalInterface 
interface MyInterface
{
    double getPiValue();
}
public class Main
{
    public static void main(String[]args)
    {
        MyInterface ref;
        ref=()->3.8990;
        System.out.println("Value of Pi="+ref.getPiValue());
    }
}