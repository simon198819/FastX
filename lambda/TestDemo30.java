import java.util.function.*;
class TestDemo30
{
    public static void main(String[]args)
    {
        Function<String,Integer>f=s->s.length();
        System.out.println(f.apply("durga"));
    }
}