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

    @Override
    public String toString()
    {
        return "This is Dog";
    }

    public static void main(String[] args)
    {
        Dog d = new Dog();
        System.out.println(d.toString());

        /* 객체 인스턴스가 String 화 될때 toString() 호출 */
        String s = "Test:" +  d ;
        System.out.println(s);
    }
}
