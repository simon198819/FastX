import java.util.function.*;
class TestDemo39
{
    public static void main(String[]args)
    {
        IntFunction<Integer>f=i->i*i;
        System.out.println(f.apply(5));
    }
}