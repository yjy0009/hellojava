package hijava.jdkbase;


/**
 * final 은 메모리주소를 변경하지 말라
 * final int i = 10;
 * i = 20; Error final 은 불변
 * fianl int[] arr = new int[5];
 * arr[0] = 100 은 Error 안남
 * 메모리안에 1,2,3, 이따로 있고 arr의 주소가 변경되는것이 아닌것이기 때문에
 * Error 나지 않음
 */
public class Student implements Cloneable, Comparable
{
    //private int id;
    private String id;
    private String name;


    public Student()
    {
        this.name = "Guest";
    }

    public Student(String id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return name + "(" + ((id == null) ? "0" : id) + ")";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        //Object 에 clone() 상속 -> super.clone()
        Student s = (Student) super.clone();
        s.name = "복제본 " + s.name;
        return s;
    }

    // 어떤순서대로 정렬할건지 ...
    @Override
    public int compareTo(Object o)
    {
        Student obj = (Student) o;
        System.out.println("comp=" + this.id + "-" + obj.id);
//        return Integer.parseInt(this.id) - Integer.parseInt(obj.id); // 작은순서 대로
        return (Integer.parseInt(this.id) - Integer.parseInt(obj.id)) * -1; // 큰 순서 대로
    }

    // hashCode : JVM 의 위치
    // clone() : 인스턴스 복제
    @Override
    public int hashCode()
    {
        return Integer.parseInt(this.id);
    }

    @Override
    public boolean equals(Object obj)
    {
        //동일한 메모리 주소면 true
        if (this == obj)
            return true;
        //this 는 절대 null 이 될 수 없으므로 obj가 null 이면 false
        if (obj == null)
            return false;
        //동일한 class type 이 아니면 false
        if (getClass() != obj.getClass())
            return false;

        Student other = (Student) obj;
        if (this.id != other.id)
            return false;
        if (name == null)
        {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;

        return true;

//        if (obj instanceof Student)
//            return name.equals(((Student) obj).name) && id.equals(((Student) obj).id);
//        return false;

//        Student other = (Student)obj;
//        return this.id == other.id && this.name != null && this.name.equals(other.name);
    }

    public static void main(String[] args) throws CloneNotSupportedException
    {
        Student student = new Student("921234", "홍길동");
        //instance 비교 불가 Complie 시에는 알수 없고 Runtime 시에 알 수 있음
        Student student1 = (Student) student.clone();

        System.out.println(student1);
    }


}
