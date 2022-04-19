package hijava.inf;

import hijava.abst.Dog;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Optional;

public class Test
{
    public static void main(String[] args) throws SQLException, IOException
    {
        Calculator calc = new CalculatorImpl();
        int x = 10, y = 5;
        calc.add(x, y);
        calc.div(x, y);
        calc.div(x, 0);

        TestInterFace test = new TestImpl();
        test.select("SELECT * FROM TABLE");
        TestInterFace.out(8);

        Dog.eat("Meat");

        int[] arr = new int[]{1, 2, 5, 9};
        SubTotal st = new SubTotal();
        st.sum(arr);
        System.out.println("Total = " + st.sum(arr));

        Oper op = new Oper();
        int a = op.add(x, y);
        int s = op.sub(x, y);

        System.out.println("ADD : "+ a+", SUB : " + s);

        op.mul(x,y);
        op.div(x,y);

        CalOper cop = new CalOper();
        int b = cop.add(x, y);
        int d = cop.sub(x, y);

        System.out.println("CAL_ADD : "+ b+", CAL_SUB : " + d);

        cop.mul(x,y);
        cop.div(x,y);
    }
}
