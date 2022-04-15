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

        eat(mom);
        eat(son);

        drink(mom);
        drink(son);

        System.out.println(son.getName());

        /* 상속과 다형성을 쓰는 이유 */
//        Man korean = new Korean("홍길동");
        Korean korean = new Korean("홍길동");
//        Man american = new American("John");
        American american = new American("John");

        sayHi(korean);
        sayHi(american);

        eatMan(korean);
        eatMan(american);

//        korean.sayHello();
//        american.sayHello();
    }

    private static void eatMan(Man m)
    {
        if(m instanceof Korean)
            ((Korean) m).eatRice();
        else if(m instanceof American)
            ((American) m).eatBread();
        else
            System.out.println("해당 Instance 가 없습니다.");
    }

    private static void drink(Mom mom)
    {
        if(mom instanceof Son)
            ((Son) mom).drinkMilk();
        else if(mom instanceof Mom)
            mom.drinkBeer();
        else
            System.out.println("해당 Instance 가 없습니다.");
    }

    private static void eat(Mom mom)
    {
        /* 상속의 instanceof 는 판단하기 어려움 -> 자식 instance 를 먼저 비교 후 부모 타입 비교*/
        if(mom instanceof Son)
            System.out.println("먹어");
        else if(mom instanceof Mom)
            System.out.println("드세요");
        else
            System.out.println("드십시오!");
    }

    /* 부모의 타입이라면 모든 자손타입이 들어올수 있음 */
    private static void sayHi(Man man)
    {
        man.sayHello();
    }
}
