package hijava.abst;

public abstract class NetSport
{
    public abstract void serve();
    public abstract void hit();
    public abstract void score();

    public final void play()
    {
        serve();
        hit();
        score();
    }
}
