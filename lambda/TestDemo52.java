import java.util.function.*;
class TestDemo52
{
    public static void main(String[]args)
    {
        BinaryOperator<Integer>b=(i1,i2)->(i1+i2);
        System.out.println(b.apply(10,20));
        System.out.println(b.apply(20,40));
        System.out.println(b.apply(30,70));
    }
}