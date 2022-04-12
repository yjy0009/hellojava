package hijava.practice;

public class ForLoop4
{
    public static void main(String[] args)
    {
        //TODO:: pattern 찾기 변하는 수와 변하지 않는수를 찾기 연습 필요 !!
        for(int i = 1; i <= 4; i++)
        {
            for(int  j = 1; j <= (4-i); j++)
                System.out.print(' ');

            for(int j = 1; j <=(2*i)-1; j++)
                System.out.print('*');

            System.out.println();
        }

    }
}
