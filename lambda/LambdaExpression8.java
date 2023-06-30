interface Sayable{
    String say(String Teasar);
}
public class LambdaExpression8
{
    public static void main(String[]args)
    {
        Sayable person=(Teasar) ->{
            String str1="Kraven The Hunter of the Devil,";
            String str2=str1+Teasar;
            return str2;
        };
        System.out.println(person.say("Time is precious."));
    }
}