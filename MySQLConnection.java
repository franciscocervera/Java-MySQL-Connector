import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MySQLConnection {
    //Database driver
    public String driver = "com.mysql.cj.jdbc.Driver";
    //Database name
    public String database = "";
    //Database address
    public String host = "";
    //Database port
    public String port = "";
    //Database username
    public String user = "";
    //Database password
    public String password = "";
    //URL creation (Change useSSL value to true if required)
    public String url = "jdbc:mysql://" + host + ":" + port + "/" + database + "?useSSL=false";

    public Connection connectMySQL() {
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            JOptionPane.showMessageDialog(null, "Successful database connection");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return conn;
    }
}