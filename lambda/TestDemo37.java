import java.util.function.*;
class TestDemo37
{
    public static void main(String[]args)
    {
        int[]x={0,5,9,45,24,10,15,20,25,30};
        Predicate<Integer>p=i->i%3==0;
        for(int x1:x)
        {
            if(p.test(x1))
            {
                System.out.println(x1);
            }
        }
    }
}
