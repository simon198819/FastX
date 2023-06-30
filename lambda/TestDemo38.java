import java.util.function.*;
class TestDemo38
{
    public static void main(String[]args)
    {
        int[]x={0,10,9,20,15,25,24,30,35,40};
        IntPredicate p=i->i%2==0;
        for(int x1:x)
        {
            if(p.test(x1))
            {
                System.out.println(x1);
            }
        }
    }
}