import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

public class DatabaseUtils {
    private static ConnectionSource source;

    static {
        try {
            source = new JdbcConnectionSource("jdbc:sqlite:test.db");
            TableUtils.createTableIfNotExists(source, Person.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ConnectionSource getSource() {
        return source;
    }
}
