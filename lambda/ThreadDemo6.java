class ThreadDemo6
{
    public static void main(String[]args)throws Exception
    {
        Runnable r=()->{
            for(int i=0;i<10;i++)
            {
                System.out.println("Child Thread");
            }
        };
        Thread t=new Thread(r);
        t.start();
        t.join();
        for(int i=0;i<10;i++)
        {try {
                Thread.sleep(2000);
                System.out.println("Main Thread-1");
            }catch(InterruptedException e){}
            // TODO: handle exception
        }
        }
    }