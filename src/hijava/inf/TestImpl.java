package hijava.inf;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestImpl implements TestInterFace
{
    /**
     * 무조건 interface 의 표준을 지켜야함
     * */
    @Override
    public ResultSet select(String sql) throws SQLException, IOException
    {
        print(sql);
        return null;
    }
}
