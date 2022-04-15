package hijava.abst;

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
    }

    private static void barkAnimal(Animal ani)
    {
        ani.bark();
    }

}
