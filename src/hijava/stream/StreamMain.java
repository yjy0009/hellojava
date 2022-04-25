package hijava.stream;

import hijava.jdkbase.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * Stream 을 쓰는 이유는 메모리를 적게쓰고 고성능의 효율을 내기 위함!!
 * PipeLine(Stream)
 *
 * #쓰기
 * FileOutputStream > OutputStreamWriter > BufferedWriter (write(), flush(), close())
 *
 * #읽기
 * FileInputStream > InputStreamReader > BufferedReader (readLine())
 *
 * FOS > OSW > BW
 * 1byte 씩 전달 OSW(UTF-8 가변형 (2~4byte) 에게 BW 2byte + 3byte (8192 다담길때 까지 기다림)
 *
 * */
public class StreamMain
{
    private static final String FILE = "test.txt";

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

        writeFile("세종대왕 한글 123");
        readFile();


    }

    private static void readFile()
    {
        try(FileInputStream fis = new FileInputStream(FILE))
        {
           InputStreamReader isr = new InputStreamReader(fis,CHARSET);
           BufferedReader br = new BufferedReader(isr);
           String data = null;
           while((data = br.readLine()) != null)
               System.out.println(data);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
//            System.out.println("test.txt 파일이 존재 하지 않습니다. >> " + e.getMessage());
        }
        catch (IOException e) // FileNotFoundException 이 IOException 의 자식
        {
            e.printStackTrace();
        }
    }

    private static void readFile0()
    {
        try(FileInputStream fis = new FileInputStream(FILE))
        {
            int data = 0;
//            byte[] buffer = new byte[10];
            while((data = fis.read()) != -1)
                System.out.println((char)data);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
//            System.out.println("test.txt 파일이 존재 하지 않습니다. >> " + e.getMessage());
        }
        catch (IOException e) // FileNotFoundException 이 IOException 의 자식
        {
            e.printStackTrace();
        }
    }

    /**
     * fos -> byte 단위로 처리 되기 때문에 한글 일본어 다 깨짐
     * osw 를 쓰면 성능이 떨어져서 bufferdwirter 를 사용
     * */
    private static final String CHARSET = "UTF-8";
    private static void writeFile(String content)
    {
        File file = new File(FILE);
        try(FileOutputStream fos = new FileOutputStream(file))
        {
            OutputStreamWriter osw = new OutputStreamWriter(fos,CHARSET);
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write(content);
            bw.flush();
            bw.close(); //오류날 상황이 많은 경우에는 finally 에

            System.out.println("Write OK : " + file.getAbsolutePath());

        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
//            System.out.println("test.txt 파일이 존재 하지 않습니다. >> " + e.getMessage());
        }
        catch (IOException e) // FileNotFoundException 이 IOException 의 자식
        {
            e.printStackTrace();
        }
    }

    private static void writeFile0(String content)
    {
        File file = new File(FILE);
        try(FileOutputStream fos = new FileOutputStream(file))
        {
            fos.write(content.getBytes());

            System.out.println("Write OK : " + file.getAbsolutePath());

        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
//            System.out.println("test.txt 파일이 존재 하지 않습니다. >> " + e.getMessage());
        }
        catch (IOException e) // FileNotFoundException 이 IOException 의 자식
        {
            e.printStackTrace();
        }
    }
}
