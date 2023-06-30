import java.util.function.*;
class TestDemo29
{
    public static void main(String[]args)
    {
Function<Integer,Integer>f=i->i*i;
System.out.println(f.apply(4));
System.out.println(f.apply(5));
    }
}