package hijava.practice;

public class Loop1
{
    public static void main(String[] args)
    {
        int i = 0;

        while (i < 10)
        {
            i++; // i = i +1 ;
            if (i > 5)
                break;

            if (i % 2 == 1)
                System.out.println("TTTTTTTTT >> " + i);
        }

    }
}
