import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static final String URL = "sql8.freesqldatabase.com";
    static final String USER = "sql8666174";
    static final String PASSWORD = "pdsKu4WEkV";
    public static void main(String[] args) throws SQLException {
        String q = "SELECT * FROM Magazzino;";
        connection().executeQuery(q);
    }
    public static Statement connection() {
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            return connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}