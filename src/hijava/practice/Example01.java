package hijava.practice;

public class Example01
{
    static int x = 7;
    static int y = 9;

    public static void main(String[] args)
    {
        swap(x, y);
        System.out.printf(" X, Y =  %d , %d " , x , y);
    }

    public static void swap(int c, int d)
    {
        int t = x;
        x = d;
        y = t;
    }
}
