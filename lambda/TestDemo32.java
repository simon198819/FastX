import java.util.function.*;
import java.util.Date;
class TestDemo32
{
    public static void main(String[]args)
    {
        Supplier<String>s=()->{
            String otp=" ";
            for(int i=0;i<6;i++)
            {
                otp=otp+(int)(Math.random()*10);
            }
            return otp;
        };
        System.out.println(s.get());
    }
}