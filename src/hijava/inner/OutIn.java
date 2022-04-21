package hijava.inner;

/**
 * Java 는 기본 Thread 기반 언어
 * */
public class OutIn
{
    Runnable getRun(int cnt)
    {
        int start = 0;

        return new Runnable()
        {
            @Override
            public void run()
            {
                int sum = 0;
                for (int i = start; i <= cnt; i++)
                    sum += i;

                System.out.println("sum = " + sum);
            }
        };
    }

    public static void main(String[] args)
    {
        OutIn oi = new OutIn();
        Runnable r = oi.getRun(100);
        r.run();
    }
}
