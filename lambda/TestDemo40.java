import java.util.function.*;
class TestDemo40
{
    public static void main(String[]args)
    {
        IntFunction<Integer>f=i->i*i;
        System.out.println(f.apply(5));
        System.out.println(f.apply(2));
        System.out.println(f.apply(4));
        System.out.println(f.apply(6));
    }
}