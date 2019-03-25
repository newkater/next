import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Dao<Person, Long> personDao = DaoManager.createDao(DatabaseUtils.getSource(), Person.class);
        personDao.forEach(per -> {
            System.out.printf("%s %s %s\n", per.getFname(), per.getMname(), per.getLname());
        });
    }
}
