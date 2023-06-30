import java.util.function.*;
class TestDemo23
{
    public static void main(String[]args)
    {
        String[]s={"Nag","Chiranjeevi","Balish","Sunny","Katreena"};
        Predicate<String>P=s1->s1.length()%2==0;
        for(String s1:s)
        {
            if(P.test(s1))
            {
                System.out.println(s1);
            }
        }
    }
}