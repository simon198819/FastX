public class LambdaExpression9
{
    public static void main(String[]args)
    {

        //Thread Example Without Lambda
        Runnable r1=new Runnable()
        {
            public void run()
            {
                System.out.println("Thread 1 Is Running");
            }
        };
        Thread t1=new Thread(r1);
        t1.start();


        //With Lambda Expression
        Runnable r2=() ->{
            System.out.println("Thread 2 is running");
        };
        Thread t2=new Thread(r2);
        t2.start();
    }
}