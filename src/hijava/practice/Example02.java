package hijava.practice;

public class Example02
{
    public static void main(String[] args)
    {
//        sumByWhile();
        sumByFor();
    }

    private static void sumByWhile()
    {
        int i = 0;
        int sum = 0;
        int oddNumSum = 0;

        while (i++ < 100)
        {
            sum += i;
            if (i % 2 == 1)
                oddNumSum += i;
        }

        System.out.println(" 1 부터 100 까지의 합 : " + sum);
        System.out.println(" 1 부터 100까지의 수 중에서 홀수의 합 : " + oddNumSum);

        /**
         * int i = 0;
         * int total = 0;
         *
         * while(i++ < 100)
         * {
         *   효율에는 차이가 없지만 읽는데 편한것으로
         *    ** if(i%2 == 0)
         *        continue;
         *
         *     if (i % 2 == 1)
         *       total = total + i;
         *
         *     total = total + i;
         * }
         *
         * System.out.println("Result is " + total );
         * */
    }

    private static void sumByFor()
    {
        /* 최초 1회 수행 , 반복 , 최초 1회 생략 */
        int total = 0;
        for(int i = 1; i<= 100; i++)
        {
            System.out.println(" i = " + i);
            total = total + i;
        }
        System.out.println("Result is " + total );

       /*
         int total = 0;
         for(int i = 100; i >= 1; i--)
         {
             System.out.println(" i = " + i);
             total = total + i;
         }
         System.out.println("Result is " + total );
        */
    }
}
