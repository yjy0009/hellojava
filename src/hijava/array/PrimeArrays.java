package hijava.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 소수 : 약수가 1과 자기자신 , 1과 자기자신으로 나누어떨어지는 수
 * 하다가 모르겠으면 특정 수를 넣고 규칙 찾기
 * 소수는 1과 자기자신 범위는 2부터 시작 되면서 자기자신 -1
 * -> 낭비 발생 2~246 까지 루프가 돌아야 함
 * <p>
 * 2 와 3 으로 나누어 떨어지지 않으면 소수
 * 자기자신보다 작은 소수 로만 나누면 됨
 */
public class PrimeArrays
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
            if (isPrime(num))
            {
                total += num;
//                PRIME_LIST.add(num);
            }
        }
        System.out.println(" Total is  " + total);
    }

    // 소수를 판별하라

    private static final List<Integer> PRIME_LIST = new ArrayList<>(); //메모리에 하나만 만들겠다

    private static boolean isPrime(int num)
    {
        for(int j : PRIME_LIST)
        {
            if (num % j == 0)
            {
                return false;
            }
        }
        PRIME_LIST.add(num); // 가독성에 좋음
        return true;
    }
}
