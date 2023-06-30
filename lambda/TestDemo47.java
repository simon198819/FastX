import java.util.function.*;
class TestDemo47
{
    public static void main(String[]args)
{
    IntUnaryOperator f=i->i*i;
    System.out.println(f.applyAsInt(5));
    System.out.println(f.applyAsInt(4));
    System.out.println(f.applyAsInt(7));
    System.out.println(f.applyAsInt(2));
}
}