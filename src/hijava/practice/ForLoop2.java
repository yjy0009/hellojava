package hijava.practice;

public class ForLoop2
{
    public static void main(String[] args)
    {
        int line  = 7;
        for (int i = 0; i < line; i++)
        {
            for (int j = 0; j < i; j++)
                System.out.print('*');
            System.out.println();
        }
        System.out.println("=====================================");
        for (int i = 7; i >0; i--)
        {
            for (int j = 1; j < i; j++)
                System.out.print('*');
            System.out.println();
        }
        System.out.println("=====================================");
        //TODO:: pattern 찾기  7 -6 , 7-5, 7-4, ....
        for (int i = 1; i <= line; i++)
        {
            for (int j = 1; j <= line - i; j++)
                System.out.print(' ');
            for (int j = 1 ; j <= i; j++)
                System.out.print('*');
            System.out.println();
        }
        System.out.println("=====================================");

    }
}
