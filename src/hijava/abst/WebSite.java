package hijava.abst;

public class WebSite extends SoftWare
{
    @Override
    public void plan()
    {
        System.out.println("Web Site Planning..");
    }

    @Override
    public void develope()
    {
        System.out.println("Web Site Developping..");
    }

    @Override
    public void release()
    {
        System.out.println("Web Site Releasing..");
    }
}
