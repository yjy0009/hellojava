package hijava.abst;

public class Dog extends Animal
{
    @Override
    public void bark()
    {
        System.out.println("멍멍!");
    }

    /**
     * Utility Class 들에서 많이 사용
     * Memory 에 한번 올라감 Method Area 에 생성 됨
     * */
    public static void eat(String food)
    {
        System.out.println("Dog food : " + food);
    }
}
