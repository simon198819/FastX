import java.util.function.*;
class TestDemo42
{
    public static void main(String[]args)
    {
        ToIntFunction<String>f=s->s.length();
        System.out.println(f.applyAsInt("Ressuration"));
        System.out.println(f.applyAsInt("Quantum"));
        System.out.println(f.applyAsInt("Dengerous"));
        System.out.println(f.applyAsInt("Devil"));
    }
}