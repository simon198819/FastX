interface Addable{
    int add(int a,int b);
}
public class LambdaExpression6
{
    public static void main(String[]args)
    {
        Addable ad1=(a,b) ->(a+b);
        System.out.println(ad1.add(20,50));

        //Lambda Expression with return keyword\
        Addable ad2=(int a,int b) ->{
            return (a+b);
        };
        System.out.println(ad2.add(30,70));
    }
}