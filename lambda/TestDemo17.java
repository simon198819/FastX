import java.util.function.*;
class Student
{
    String name;
    int marks;
    Student(String name,int marks)
    {
        this.name=name;
        this.marks=marks;
    }
}
class TestDemo17
{
public static void main(String[]args)
{
    Function<Student,String> f=s->{
        int marks=s.marks;
        String grade="";
        if(marks>=80) grade="A[Distinction]";
        else if(marks>60) grade="B[First Class]";
        else if(marks>50) grade="C[Second Class]";
        else if(marks>35) grade="D[Thard Class]";
        else grade="E[Failed]";
        return grade;
    };
    Student[]s={new Student("Durga",100),
                new Student("Sunny",65),
                new Student("Benny",55),
                new Student("Chinny",45),
                new Student("Vinny",25),
                };
                for(Student s1:s)
                {
                    System.out.println("Student Name:"+s1.name);
                    System.out.println("Student marks:"+s1.marks);
                    System.out.println("Student grade:"+f.apply(s1));
                    System.out.println();
                }
}
}

