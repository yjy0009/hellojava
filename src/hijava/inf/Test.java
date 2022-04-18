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
    }
}
