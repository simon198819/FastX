import java.util.function.*;
class TestDemo12
{
public static void main(String[]args)
{
    Predicate<Integer>p1=i->i%2==0;
    System.out.println(p1.test(10));
    System.out.println(p1.test(9));
    System.out.println(p1.test(12));
    System.out.println(p1.test(30));
    System.out.println(p1.test(40));
}
}