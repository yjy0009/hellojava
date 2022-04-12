package hijava.practice;

/**
 * 소수 : 약수가 1과 자기자신 , 1과 자기자신으로 나누어떨어지는 수
 * 하다가 모르겠으면 특정 수를 넣고 규칙 찾기
 * 소수는 1과 자기자신 범위는 2부터 시작 되면서 자기자신 -1
 *
 * Method 는 Stack
 * Line 은 Queue
 */
public class Prime
{
    public static void main(String[] args)
    {
        if (args.length > 0)
        {
            for (int i = 0; i < args.length; i++)
                System.out.println("args[" + i + "]" + args[i]);
        }

        int total = 0;
        for (int num = 2; num <= 100; num++)
        {
            /**
             * boolean isPrime = true;
             *
             * 해당 부분이 isPrime 메소드로 변경
             *  for (int j = 2; j < num; j++)
             *  {
             *  if (num % j == 0)
             *  {
             *     isPrime = false;
             *     break;
             *  }
             *  }
             */

            if (isPrime(num))
                total += num;
            else
                System.out.println(num + " is not Prime Number!! ");
        }
        System.out.println(" Total is  " + total);
    }

    // 소수를 판별하라
    private static boolean isPrime(int num)
    {
        for (int j = 2; j < num; j++)
        {
            if (num % j == 0)
            {
                return false;
            }
        }
        return true;
    }
}
