import java.util.function.*;
class TestDemo21
{
    public static void main(String[]args)
    {
        Predicate<Employee>P1=e->e.salary>10000 && e.IsHavingGirlfriend=true;
        system.out.println(P1.Test(e));
    }
}