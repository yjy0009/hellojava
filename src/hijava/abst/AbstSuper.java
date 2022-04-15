package hijava.abst;

public abstract class AbstSuper
{
    public abstract int max(int i, int j) ;

    public int min(int i, int j)
    {
        return i > j ? j : i ;
    }
}
