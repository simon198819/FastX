import java.util.function.*;
class TestDemo46
{
    public static void main(String[]args)
    {
        UnaryOperator<Integer>f=i->i*i;
        System.out.println(f.apply(6));
        System.out.println(f.apply(4));
        System.out.println(f.apply(5));
        System.out.println(f.apply(7));

    }
}