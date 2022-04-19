package hijava.inf;

import java.util.Scanner;

public class ScannerTest
{
    public static void main(String[] args)
    {
        calculator();
    }

    private static void calculator()
    {
        /**
         * nextInt nextLine 하면 nextLine 이 바로 종료 되어 버림
         * nextInt 를 사용 하려면 hasNext 를 해줘야 함
         * Line 인식이 안되서 그런것
         *
         * 전부 nextLine 으로 받고 Integer.parseInt() 로 해서 변경후 계산 처리
         * */
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("계속>>");
            String last = inputScan(sc);

            if("quit".equalsIgnoreCase(last))
            {
                sc.close();
                break;
            }

            int x = inputScanNumber("X => ", sc);
            int y = inputScanNumber("Y => ", sc);

            System.out.print("(+,-,*,/) 중에 선택하세요 => ");
            String op = inputScan(sc);

            System.out.println("계속>>");

            int result = 0;
            System.out.print(x + " " + op + " " + y + "=" );

            CalOper cal = new CalOper();
            if("+".equals(op))
            {
                System.out.println(cal.add(x, y));
            }
            else if("/".equals(op))
            {
                cal.div(x, y);
            }
            else if("*".equals(op))
            {
                cal.mul(x, y);
            }
            else if("-".equals(op))
            {
                System.out.println(cal.sub(x, y));
            }
            else
            {
                System.out.println("정확한 연산자를 입력하세요!!");
            }



//            switch (op)
//            {
//                case "+":
//                    System.out.println(cal.add(x, y));
//                    break;
//                case "-":
//                    System.out.println(cal.sub(x, y));
//                    break;
//                case "*":
//                    cal.mul(x, y);
//                    break;
//                case "/":
//                    cal.div(x, y);
//                    break;
//                default:
//                    System.out.println("정확한 연산자를 입력하세요!!");
//            }
        }


    }

    private static String inputScan(Scanner sc)
    {
        String op = sc.next();
        System.out.println("연산자 : " + op);
        return op;
    }

    private static int inputScanNumber(String msg, Scanner sc)
    {
        System.out.print(msg);
        int x = sc.nextInt();
        System.out.println(msg + x);
        return x;
    }
}
