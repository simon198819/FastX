interface Interf
{
    public void m1();
}
class LambdaTest1
{
public static void main(String[]args)
{
    Interf i=()->System.out.println("Hello---Bt lambda Expression");
    i.m1();
}
}

