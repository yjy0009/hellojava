package hijava.practice;

/* CallByValue , CallByReference */
public class CBVR
{
    int m = 2;

    public static void main(String[] args)
    {
        /** CallByValue 값이 전달
            int i = 1; // 물이 담긴 컵
            System.out.println("i1 = " + i);

            change1(i); // 컵을 전달한것 같은 느낌
            System.out.println("i2 = " + i); // 1이 그대로 -> i 는 물이 전달 즉 값이 전달 CallByValue
         */

        /** CallByReferece 주소값이 전달
            CBVR cb1 = new CBVR();
            System.out.println("cb1 = " + cb1.m);

            change2(cb1);
            System.out.println("cb2 = " + cb1.m); // 그릇이 전달 -> 공간이 전달 되서 값이 바뀜 공간안에 값이 담겨있어서 자동으로 딸려감 CallbyReference
         */

    }

    public static void change2(CBVR cb)
    {
        cb.m = 100;
    }

    public static void change1(int x)
    {
        System.out.println("x = " + x);
        x = 100;
    }
}
