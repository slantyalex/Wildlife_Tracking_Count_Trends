package wildlife.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String URL = "jdbc:postgresql://localhost:5432/wildlife";
    private static final String USER = "wildlife_user";
    private static final String PASSWORD = "ILOVEBIRDS0981";

    public static Connection connect() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
