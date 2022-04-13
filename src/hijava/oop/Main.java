package hijava.oop;

public class Main
{
    public static void main(String[] args)
    {
        Man hong = new Man("Hong");
        Man john = new Man("John");

        hong.buyCoffee(1);
        hong.buyDount(2);

        john.buyCoffee(2);
        john.buyDount(1);

        System.out.println(hong.toString());
        System.out.println(john.toString());
    }
}
