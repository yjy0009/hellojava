package hijava.inheritance;

import hijava.oop.Man;

public class InheritanceTest
{
    public static void main(String[] args)
    {
        Mom mom = new Mom("영자");
        mom.say();
        Mom son = new Son("길동");
        son.say();

        System.out.println(son.getName());

        /* 상속과 다형성을 쓰는 이유 */
//        Man korean = new Korean("홍길동");
        Korean korean = new Korean("홍길동");
//        Man american = new American("John");
        American american = new American("John");

        sayHi(korean);
        sayHi(american);

//        korean.sayHello();
//        american.sayHello();
    }

    /* 부모의 타입이라면 모든 자손타입이 들어올수 있음 */
    private static void sayHi(Man man)
    {
        man.sayHello();
    }
}
