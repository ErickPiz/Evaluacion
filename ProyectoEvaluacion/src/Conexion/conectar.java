package Conexion;
/**
 * @author ING ARCADIA
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conectar {
    static Statement sentencia;
    static ResultSet resultado;
    
    Connection conectar=null;
    
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://187.210.226.213/mysql","root","orion1024");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return conectar;
    }
    /*    public static ArrayList llenarComboRubro(){
    ArrayList<String> lista1 = new ArrayList<>();
    try {
    resultado = sentencia.executeQuery("SELECT * FROM rubro");
    } catch (SQLException ex) {
    Logger.getLogger(conectar.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
    while(resultado.next()){
    lista1.add(resultado.getString("descripcion"));
    }
    } catch (Exception e) {
    System.out.println("error");
    }
    return lista1;
    }*/
}
