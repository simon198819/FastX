import java.util.function.*;
import java.util.*;
class Employee
{
    int eno;
    String name;
    Employee(int eno,String name)
    {
        this.eno=eno;
        this.name=name;
    }
}
class TestDemo35
{
    public static void main(String[]args)
    {
        ArrayList<Employee>l=new ArrayList<Employee>();
        BiFunction<Integer,String,Employee>f=(eno,name)->new Employee(eno,name);
        l.add(f.apply(100,"Durga"));
        l.add(f.apply(200,"Ravi"));
        l.add(f.apply(300,"Shiva"));
        l.add(f.apply(400,"Pavan"));
        l.add(f.apply(500,"Don"));
        for(Employee e:l)
        {
            System.out.print("Employee Number:"+e.eno);
            System.out.print("Employee Name:"+e.name);
        }
    }
}
