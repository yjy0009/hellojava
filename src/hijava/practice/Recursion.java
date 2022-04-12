package hijava.practice;

public class Recursion
{
    public static void main(String[] args)
    {
        int ret = fibo(10);
        System.out.println(ret);

        int inum = 10;
        for (int i = 0; i < inum; i++)
        {
            System.out.print(fibo(i) + " ");
        }
    }

    private static int fibo(int num)
    {
//        if(num <= 1) return num ;
        if (num > 1)
            return fibo(num - 1) + fibo(num - 2);
        else
            return num;
    }
}
