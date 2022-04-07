package hijava.practice;

/**
 * ASCII, UniCode
 */
public class Str
{
    public static  void main(String[] args)
    {
        char c = '한'; // c = 65, c = '\uD55C'
        byte b = 'B';

        System.out.println(c);
        System.out.println((int)c);
        System.out.println(b);

        String str = "AB";
        System.out.println(str);
        System.out.println("AB".getBytes().length); //2byte
        System.out.println("AB한".getBytes().length); //5byte
        System.out.println("한".getBytes().length); //3byte
    }

    /**
     * var (From Java 10)
     * var a = 1 -> int a = 1; compile 은 int 형으로 되어 있음
     * var b = 2 -> int b = 2;
     * a + b = 3 -
     *
     * var c = 'c' -> char c = 'c'
     * var s = "HI" -> String s = "HI";
     * But, i = 2.34; // ??? -> error 발생 i는 int 형태 라서
     */
}
