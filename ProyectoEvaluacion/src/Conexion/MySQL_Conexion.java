package Conexion;
/**
 * @author ING ARCADIA
 */
import java.sql.*;

public class MySQL_Conexion {

    private Connection conexion;
    
    // DESDE UN PRINCIPOIO YA TENGA INSTANCIADA LA CONEXION, POR ESO ES 
    // DE TIPO STATICO
    private static String DataBase = "mysql",
                            URL = "187.210.226.213",
                            User = "root",
                            Password = "orion1024";
    
    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
    
    
    public MySQL_Conexion conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String BaseDeDatos = "jdbc:mysql://" + URL + "/" + DataBase, User, Password;// PIDE CARGAR UN THROWS 
            setConexion(DriverManager.getConnection(BaseDeDatos));
            if (conexion != null) {
                System.out.println("Conexion exitosa!");
            } else {
                System.out.println("Conexion fallida!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return this;
    }

    public ResultSet consultar(String sql) {
        ResultSet resultado;
        try {
            Statement sentencia = getConexion().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            resultado = sentencia.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return resultado;
    }

    public boolean ejecutar(String sql) {
        try {
            Statement sentencia = getConexion().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            sentencia.executeUpdate(sql);
            sentencia.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}