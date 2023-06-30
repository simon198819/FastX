import java.util.function.*;
class TestDemo20
{
    public static void main(String[]args)
    {
        Predicate<Integer>P1=i->i%2==0;
        System.out.println(P1.test(10));
        System.out.println(P1.test(15));
        System.out.println(P1.test(30));
        System.out.println(P1.test(45));
        System.out.println(P1.test(50));
    }
}