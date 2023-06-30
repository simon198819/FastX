interface Sayable
{
public String Say();
}
public class LambdaExpression2
{
    public static void main(String[]args)
    {
        Sayable s=() ->
        {
            return "Say Hello EveryOne.";
        };
        System.out.println(s.Say());
    }
}

//no parameter