import java.util.function.*;
class TestDemo43
{
public static void main(String[]args)
{
    IntToDoubleFunction f=i->Math.sqrt(i);
    System.out.println(f.applyAsDouble(9));
}
}