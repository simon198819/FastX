import java.util.function.*;
class TestDemo44
{
public static void main(String[]args)
{
    IntToDoubleFunction f=i->Math.sqrt(i);
    System.out.println(f.applyAsDouble(9));
    System.out.println(f.applyAsDouble(16));
    System.out.println(f.applyAsDouble(66));
    System.out.println(f.applyAsDouble(55));
}
}