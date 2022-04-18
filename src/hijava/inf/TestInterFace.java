package hijava.inf;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface TestInterFace
{
    public ResultSet select(String sql) throws SQLException, IOException;
    default void print(String sql)
    {
        System.out.println(sql);
    }

    static void out(int x)
    {
        System.out.println("x = " + x);
    }
}
