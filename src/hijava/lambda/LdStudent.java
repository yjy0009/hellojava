package hijava.lambda;

import hijava.jdkbase.Student;

@FunctionalInterface
public interface LdStudent
{
    Student makeStudent(String id, String name);
}
