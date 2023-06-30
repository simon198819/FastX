import java.util.function.*;
class TestDemo49
{
    public static void main(String[]args)
    {
        BiFunction<String,String,String>f=(s1,s2)->s1+s2;
        System.out.println(f.apply("Durga","Software"));
        System.out.println(f.apply("Jodha","Akbar"));
        System.out.println(f.apply("Coca","Cola"));
    }
}