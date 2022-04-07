package hijava.practice;

public class Example02
{
    public static void main(String[] args)
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
         * while(i++ < 100)
         * {
         *
         * }
         * */
    }
}
