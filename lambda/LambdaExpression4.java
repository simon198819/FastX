interface Addable
{
    int add(int a,int b);
}
public class LambdaExpression4
{
    public static void main(String[]args)
    {
        Addable ad1=(a,b) ->(a+b);
        System.out.println(ad1.add(10,20));

        Addable ad2=(a,b) ->(a+b);
        System.out.println(ad2.add(34,45));
    }
}

//Multiple parameter