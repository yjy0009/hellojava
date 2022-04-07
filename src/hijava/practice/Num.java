package hijava.practice;

public class Num
{
    public static void main(String[] args)
    {
        byte b = 1;
        short s = 1;
        int i = 2147483647; //Integer number too large , overflow error
        long l = 2147483648L; //long 은 keyword l, L 을 붙여야 함

        /* 소수 * 2 이 값이 1 보다 크면 1 아니면 0 으로 표시 */
        System.out.println("0.1+0.2 = " + (0.1+0.2));

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
    }
}
