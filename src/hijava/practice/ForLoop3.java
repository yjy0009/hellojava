package hijava.practice;

public class ForLoop3
{
    public static void main(String[] args)
    {
        for(int i=2; i<=9; i++)
        {
            if(i%2 == 0)
            {
                System.out.println("==========="+i+"단===========" );
                for (int j = 1; j <= 9; j++)
                    System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}
