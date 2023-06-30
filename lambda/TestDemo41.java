import java.util.function.*;
class TestDemo41
{
    public static void main(String[]args)
    {
        ToIntFunction<String>f=s->s.length();
        System.out.println(f.applyAsInt("Ressuration"));
    }
}