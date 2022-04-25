package hijava.stream;

import hijava.jdkbase.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain
{
    public static void main(String[] args)
    {
        List<Student> students = new ArrayList<>();
        students.add(new Student("100", "Hong100"));
        students.add(new Student("20", "Lim20"));
        students.add(new Student("5", "Lee5"));

        System.out.println(students);
        System.out.println("==============================================");
        Collections.sort(students, new Sorting());
        System.out.println(students);

        int arr[] = new int[]{2, 3, 1, 5, 3, 2};
        double avg = Arrays.stream(arr).average().getAsDouble();
        System.out.println("avg = " + avg);
        Arrays.stream(arr).sorted().forEach(n -> System.out.println("sort = " + n));
        Arrays.stream(arr).distinct().forEach(n -> System.out.println("distinct = " + n));
        Arrays.stream(arr).sorted().distinct().forEach(n -> System.out.println("sortDistinct = " + n));
        Arrays.stream(arr).filter(n -> n > 2).forEach(n -> System.out.println(n));

        System.out.println("================================================");
        System.out.println(Arrays.stream(arr).reduce(0, (p, n) -> p + n));// 초기값 이전결과 , 현재값 p+= p+n

        students.stream().map(s -> s.getName()).forEach(n -> System.out.println(n));

        students.stream().mapToInt(s -> Integer.parseInt(s.getId())).forEach(n -> System.out.println(n));

        System.out.println(students);
        System.out.println("================================================");
        Collections.sort(students, new Sorting());
        System.out.println(students);


        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("90", "홍길동"));
        students2.add(new Student("80", "김일수"));
        students2.add(new Student("75", "김이수"));
        students2.add(new Student("95", "김삼수"));
        students2.add(new Student("98", "김사수"));
        students2.add(new Student("87", "김오수"));

        //1. 학생의 이름
        students2.stream().forEach(n -> System.out.println(n.getName()));
        System.out.println("==============================================");

        //2. 학번의 총합과 평균 Stream 은 일회성
        Student[] arr2 = new Student[students2.size()];
        students2.toArray(arr2);
        int sum = Arrays.stream(arr2).mapToInt(s -> Integer.parseInt(s.getId())).sum();
        double avg2 = Arrays.stream(arr2).mapToInt(s -> Integer.parseInt(s.getId())).average().getAsDouble();
        System.out.println("sum = " + sum + ", avg = " + avg2);
        System.out.println("==============================================");

        //3.90번 이상인 사람들만 정렬해서 출력
        students2.stream().filter(n -> Integer.parseInt(n.getId()) >= 90).sorted().forEach(e -> System.out.println(e));
//      Arrays.stream(arr2).filter(n -> Integer.parseInt(n.getId()) >= 90).sorted().forEach(e -> System.out.println(e));


    }
}
