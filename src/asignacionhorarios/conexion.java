package asignacionhorarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class conexion {
    public static final String URL = "jdbc:mysql://localhost:3306/asignacionh";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "toor";

    PreparedStatement ps;
    ResultSet rs;

    public static Connection getConnection() {
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            JOptionPane.showMessageDialog(null, "Conexion exitosa!");

        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
}
