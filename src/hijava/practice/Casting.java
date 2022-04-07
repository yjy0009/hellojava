package hijava.practice;

public class Casting
{
    public static void main(String[] args)
    {
        byte b = 1;
        int i = b;
//        b = i; -> 1byte = 4byte
        long l = 1234567;

        System.out.println(i+l); // i는 int l은 long
    }
}
