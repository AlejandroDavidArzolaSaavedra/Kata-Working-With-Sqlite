package kata5p1;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import static kata5p1.MailListReader.read;

public class Kata5P1 {
public static void main(String[] args) throws FileNotFoundException {
    Kata5P1 kata = new Kata5P1();
    String urlEmail = "C:\\Users\\Lab-DIS\\Documents\\NetBeansProjects\\Kata5P1\\email.txt";        
    List<String> email = read(urlEmail);   
    kata.metodo(email);
}
    public void metodo(List<String>email){
        for(String mail: email){
            insert(mail);
        }
    }
    
    /**
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
        */
    
    private Connection connect() {
        String url = "jdbc:sqlite:mail.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    static int i = 1;
   public void insert(String email) {
    String sql = "INSERT INTO direcc_email(direccion) VALUES(?)";
    try (Connection conn = this.connect();
        PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, email);
        i+=1;
        pstmt.executeUpdate();
    } catch (SQLException e) {
        System.out.println(e.getMessage());
        }
    }
}

