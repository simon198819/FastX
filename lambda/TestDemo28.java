import java.util.*;
class TestDemo28
{
    public static void main(String[]args)
    {
        int[]x={0,5,10,15,20,25,30,35};
    {
        Predicate<Integer>P1=i->i%2==0;
        Predicate<Integer>P2=i->i>10;
        System.out.println("The number which are even or>10 are:");
        for(int x1:x)
        {
            if(P1.or(P2).test(x1))
            {
                System.out.println(x1);
            }
        }
    }
    }
}