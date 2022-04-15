package hijava.abst;

public abstract class SoftWare
{
    public abstract void plan();
    public abstract void develope();
    public abstract void release();

    public final void product()
    {
        plan();
        develope();
        release();
    }

}
