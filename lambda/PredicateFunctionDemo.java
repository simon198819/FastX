import java.util.function.Predicate;
public class PredicateFunctionDemo
{
    public static void main(String[]args)
    {
        //Predicate<String>checklength=s->s.length() >=5;
        Predicate<String>checklength=s->s.length() %2==0;
        System.out.println("The Length of the String is greater than 5 :" + checklength.test("code"));
    }
}