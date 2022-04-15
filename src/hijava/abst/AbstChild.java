package hijava.abst;

public class AbstChild extends AbstSuper
{
    @Override
    public int max(int i, int j)
    {
        return i > j ? i : j;
    }
}
