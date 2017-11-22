package Conexion;
/**
 * @author ING ARCADIA
 */
import java.sql.*;

public class MySQL_Conexion {
    // DESDE UN PRINCIPOIO YA TENGA INSTANCIADA LA CONEXION, POR ESO ES 
    // DE TIPO STATICO
    private static String DataBase = "mysql",
                            URL = "187.210.226.213",
                            User = "root",
                            Password = "orion1024";
    // ESTA ES LA VARIABLE PARA CONECTAR A MYSQL
    public static java.sql.Connection getConnection() throws ClassNotFoundException, SQLException{
    
        //CREANDO LA VARIABLE DE TIPO CONEXION
        Connection Respuesta;
        
        Class.forName("com.mysql.jdbc.Driver"); // PIDE CARGAR UN THROWS 
        
        // UTLIZAMOS UN CONTROLADOR DE CONTROLADORES DRIVEMANAGER
        Respuesta = DriverManager.getConnection("jdbc:mysql://" + URL + "/" + DataBase, User, Password);// PIDE CARGAR UN THROWS 
        // POR MEDIO DEL CONTROLADOR PUEDO TENER LAS CREDENCIALES 
        return Respuesta;
    }
    
}

