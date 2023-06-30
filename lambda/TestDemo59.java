import java.time.*;
public class TestDemo59
{
public static void main(String[]args)
{
    LocalTime time=LocalTime.now();
    int h=time.getHour();
    int m=time.getMinute();
    int s=time.getSecond();
    int n=time.getNano();
    System.out.printf("%d:%d:%d:%d",h,s,n,n);
    }
}

