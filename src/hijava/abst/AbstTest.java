package hijava.abst;

/**
 * String 은 Final Class
 * 추상 Class 는 다형성을 위한것
 * OOP -> 상속성(extends), 은닉성(getter, setter), 다형성(abstract, interface)
 * */
public class AbstTest
{
    public static void main(String[] args)
    {
        AbstSuper sp = new AbstChild();
        int x = 5;
        int y = 10;

        System.out.println("MIN : " + sp.min(x, y) + " , MAX : " + sp.max(x, y));

        Weight guen = new Guen();
        Weight pound = new Pound();

        int cnt = 5;
        System.out.println("Guen : " + guen.getGram(cnt));
        System.out.println("Pound : " + pound.getGram(cnt));

        Animal dog = new Dog();
        Animal cat = new Cat();

        barkAnimal(dog);
        barkAnimal(cat);

        NetSport pingpong = new PingPong();
        NetSport tennis = new Tennis();

        System.out.println("============================");
        pingpong.play();
        System.out.println("============================");
        tennis.play();

        SoftWare webSite = new WebSite();
        SoftWare mobileApp = new MobileApp();

        System.out.println("============================");
        webSite.product();
        System.out.println("============================");
        mobileApp.product();
    }

    private static void barkAnimal(Animal ani)
    {
        ani.bark();
    }

}
