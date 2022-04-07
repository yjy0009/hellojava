package hijava.practice;

public class Oper
{
    public static void main(String[] args)
    {
        int i = 0;
        i += 1; // i = i + 1 <=> i++
        i += 10; // i = i + 10
        System.out.println(i);

        int k = !( i > 0 ) ? 100 : 1000 ;
        System.out.println("k = " + k );

        i++;//i = i +1 ;
        i--;//i = i -1 ;

        int j = i++;
        System.out.println(i++ + ", j= " + j);

        /**
         * 비트 연산자
         * 0 -> 거짓, 1 -> 참
         * 0101 & 1010 -> 0000 (둘다 참이여야만 참)
         * 0101 | 1010 -> 1111 (하나만 참이라도 참)
         * 0101 ^ 1010 -> 1111 (다를때만 참)
         * ~100 -> 011 (toggle , 반전)
         * << (shint 연산자) 5<<2 0101ㅁㅁ -> 왼쪽으로 두칸씩 이동 010100 빈공간은 0으로 채움 5*2^2
         * >> 5 >> 2 -> 튀어나온건 버림 제일앞 부호비트 1이면 음수 0이면 양수 빈자리는 부호비트로
         * >>> 부호와 상관업이 무조건 0으로 채움
         * */

    }
}
