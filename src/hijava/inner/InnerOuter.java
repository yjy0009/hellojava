package hijava.inner;

public class InnerOuter
{
    private int id;
    private String name;

    public int getId()
    {
        return this.id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void callIn()
    {
        Inner inner = new Inner();
        inner.in();
    }

    class Inner
    {
//        static String inStr; -> Method Area에 생성 됨 Heap Area 에서 나올수 없음
        public void in()
        {
            System.out.println("in inner class >> name = " + name);
        }
    }

    static class StaticInner
    {
        //name 접근 불가
        static String inStr = "Static Inner inStr";
        public static void in()
        {
            System.out.println("Static inner class >> name = " + inStr);
        }

    }

    public static void main(String[] args)
    {
        // 학생의 보호자 이름 학생Class 를 통해서만 보호자 Class 접근
        InnerOuter o = new InnerOuter();
        o.setName("Hong");
        System.out.println("o.name = " + o.getName());
        o.callIn();

        StaticInner.in();

//        Inner i = new Inner(); -> InnerOuter Class 가 먼저 생성되어야 함함
    }
}

