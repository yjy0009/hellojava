package hijava.stream;

import hijava.jdkbase.Student;

import java.util.Comparator;

public class Sorting implements Comparator<Student>
{
    @Override
    public int compare(Student o1, Student o2)
    {
//        return Integer.parseInt(o1.getId()) - Integer.parseInt(o2.getId());
//        return o1.getName().compareTo(o2.getName());
        return o1.compareTo(o2); //Student Class 에 정의 되어 있어야 함
    }

    public static void mian(String[] args)
    {
        String s1 = "s100";
        String s2 = "s200";
        System.out.println(s1.compareTo(s2));
    }
}
