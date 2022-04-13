package hijava.oop;

public class Student01
{
    public static void main(String[] args)
    {
        Student s = new Student("김일수");
        s.setStudentNo("9876565");
        s.setAge("14");
        s.setTelNo("010-9999-8888");
        System.out.println(s.toString());
    }
}
