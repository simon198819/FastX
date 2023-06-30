import java.util.*;
class MyThread extends Thread
{
    static ArrayList l=new ArrayList();
    public void run()
    {
        try{
        Thread.sleep(2000);
    }catch(InterruptedException e){}
    System.out.println("Child Thread Updating List");
    l.add("O");
}
}
class IteratorDemo1
{
    public static void main(String[]args)throws Exception
    {
        l.add("A");
        l.add("B");
        l.add("C");
        MyThread t=new MyThread();
        t.start();
        Iterator itr=l.Iterator();
        while(ltr.hasNext())
        {
            String s1=(String)itr.next();
            System.out.println("Main Thread iterating List and current object is:"+s1);
            Thread.sleep(2000);
        }
        System.out.println(l);
    }
}