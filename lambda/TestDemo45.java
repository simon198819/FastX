import java.util.function.*;
class TestDemo45
{
    public static void main(String[]args)
    {
        UnaryOperator<Integer>f=i->i*i;
        System.out.println(f.apply(6));
    }
}