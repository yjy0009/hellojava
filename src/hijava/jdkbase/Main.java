package hijava.jdkbase;

import hijava.oop.Man;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main
{
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException,
            NoSuchMethodException, InvocationTargetException
    {
        /**
         * Heap Area 에 hong, kim (주소값) 생성
         * Equals 는 두 instance 에 주소값이 같냐
         * s.name = "홍길동" new String("홍길동") -> 동일한 주소를 가짐
         * String, Integer 는 같은 값이면 같은 메모리 주소를 가짐
         * 값이 달라지면 그제서야 새로운 메모리 주소를 가짐
         * */
        Man hong = new Man("Hong");
        Man kim = new Man("Kim");
        Man kildong = hong;
        Man ilsoo = new Man("Kim");

        System.out.println("hong hash : " + hong.hashCode());
        System.out.println("kim hash : " + kim.hashCode());
        System.out.println("kildong hash : " + kildong.hashCode());

        System.out.println(System.identityHashCode(kildong));
        System.out.println(hong.equals(kim));
        System.out.println(hong.equals(kildong));
        System.out.println(ilsoo.equals(kim));

        Student student = new Student("921234", "홍길동");
        Student student1 = new Student("921234", "홍길동");
        String ss = new String("홍길동1");

        System.out.println(student.toString());
        System.out.println(student.equals(student1));

        // 메모리 주소 비교시 identityHashCode 사용
        System.out.println(System.identityHashCode(student.getId()));
        System.out.println(student.getName().hashCode() + "::" + ss.hashCode());
        System.out.println(student.getName().hashCode() + "::" + student.getId().hashCode() + "::" + student1.getId().hashCode());

        String s1 = new String("123abc"); // 인스턴스 의 주소를 가지고 그안에 메모리주소, Heap Area 에 생성
        String s2 = "123abc"; // 상수 풀 (Constant Pool) 생성
        String s3 = "123abc"; // 상수 풀 (Constant Pool) 생성

        // == -> 메모리 주소를 비교 하므로 다름
        System.out.println("s1 == s2 : " + (s1 == s2) + ", " + s1.equals(s2));
        System.out.println(s3 == s2);
        System.out.println(System.identityHashCode(s1) + ", " + System.identityHashCode(s2) + ", " + System.identityHashCode(s3));
        System.out.println(s1.hashCode() + ", " + s2.hashCode() + ", " + s3.hashCode());

        /**
         * StringBuffer -> Thread Safer 함 , Java는 MultiThread 환경
         *              -> 여러사람이 동시에 접근 접속 하였을때 서로 바꾸려고 할때 DeadLock 발생
         *              -> synchronized 를 걸어서 한사람이 작업중일때 다른사람이 접근 하지 못하도록
         *
         * StringBuilder -> s1 + s2
         * */

        StringBuilder sb = new StringBuilder();
        sb.append("aaaaaaaa");

        System.out.println("sb1= " + sb.toString());
        sb.setLength(0);
        System.out.println("sb2= " + sb.toString());

        StringBuffer sf = new StringBuffer();
        sf.append("aaaaaaaa");

        System.out.println("sb1= " + sf.toString());
        sf.setLength(0);
        System.out.println("sb2= " + sf.toString());

        // TODO:: Java Reflection
        // Class.forName() : class 를 동적으로 할당
        System.out.println(student.getClass() + ", " + student.getClass().getName() + " , "+ student.getClass().getSimpleName());

        String inputStr = "hijava.jdkbase.Student";
        Class<?> cls = Class.forName(inputStr);
//        Student student22 = (Student) cls.newInstance();

        Package pkg = cls.getPackage();
        System.out.println("pkg= " + pkg);

        for(Constructor c : cls.getConstructors())
            System.out.println("Constructor : " + c);
        for(Field f : cls.getFields())
            System.out.println("Fields : " + f);
        for(Method m : cls.getMethods())
        {
            System.out.println("Mthod : " + m.getName());
            if("getName".equals(m.getName()))
                System.out.println("----------------------");
        }

        Student newStu = (Student)cls.newInstance();
        System.out.println(newStu);
        Method setNameMthod = cls.getMethod("setName", String.class);
        setNameMthod.invoke(newStu, "홍길동");
        Method getName = cls.getMethod("getName");
        Method setId = cls.getMethod("setId", String.class);
        setId.invoke(newStu,"987654");
        System.out.println("newStu.name = " + getName.invoke(newStu));
        System.out.println(newStu);


        /**
         * String -> Class -> Instance -> run
         * Package & class Constructors & Fields & methods
         * */

//        class.forName("mysql.Driver.sdfds.fdsfds");

        boolean hasContition = true;

        // String 으로 하면 계속 새로운 메모리 주소 생성 -> 비효율적
        // Java8 이상은 JVM 에서 StringBuilder 로 내부적으로 전환
        String searchStr = "홍길동";
        String s = "select * from Tbl";
        if(hasContition)
        {
            s = s + "where name like '%"+ searchStr + "%'";
            s += " and id > 0 ";
            s += " list 10 ";
        }

        StringBuilder sb1 = new StringBuilder();
        sb1.append("select * from Tbl ");
        if(hasContition)
        {
            sb1.append("where name like '%").append(searchStr).append("%'");
            sb1.append(" and id > 0 ");
            sb1.append(" list 10 ");
        }

    }
}
