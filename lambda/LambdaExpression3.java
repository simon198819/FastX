

interface Sayable
{
    public String say(String name);
}
public class LambdaExpression3
{
    public static void main(String[]args)
    {
        Sayable s1=(name) ->{
            return "Hello,"+name;
        };
        System.out.println(s1.say("Pintu"));

        Sayable s2= name ->{
            return "Hello,"+name;
        };
        System.out.println(s2.say("Chintu"));
    }
}