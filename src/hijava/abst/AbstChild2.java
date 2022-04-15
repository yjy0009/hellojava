package hijava.abst;

public abstract class AbstChild2 extends AbstSuper
{
    @Override
    public int max(int i, int j)
    {
        return i > j ? i + 100 : j + 1000;
    }
    /**
     * 추상클래스는 어디에 있어도 되기 때문에
     * 메서드가 어디에 있든 상관이 없어 추적이 힘듬
     * 오해의 소지가 있음
     * 계속해서 타고 올라가봐야 함
     * */
}
