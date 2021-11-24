package kata5p1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Kata5P1 {
public static void main(String[] args) {
    SelectApp app = new SelectApp();
    app.selectAll();
    String url = "jdbc:sqlite:mail.db";
    String sql = "CREATE TABLE IF NOT EXISTS direcc_email (\n"
        + " id integer PRIMARY KEY AUTOINCREMENT,\n"
            + " direccion text NOT NULL);";
    try (Connection conn = DriverManager.getConnection(url);
        Statement stmt = conn.createStatement()) {
        stmt.execute(sql);
        System.out.println("Tabla creada");
    } catch (SQLException e) {
    System.out.println(e.getMessage());
        }
    }

    private static void connect() {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:Kata5.db";
            conn = DriverManager.getConnection(url);
            System.out.println("Connexión a SQLite establecida");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}

