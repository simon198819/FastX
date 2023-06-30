interface Interf
{
    public void add(int a,int b);
}
class LambdaTest2
{
    public static void main(String[]args)
    {
        Interf i=(a,b)->System.out.println("The sum:"+(a+b));
        i.add(10,20);
        i.add(100,200);
        i.add(1000,2000);
    }
}
