package Usuario;

/**
 * @author Piz
 */
public class Usuario {
    
    String usuario;
    String contrasena;
    boolean administrador;

    public Usuario(String usuario, String contrasena, boolean administrador) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.administrador = administrador;
    }
    
    public void setUsuario(Usuario u){
        this.usuario = u.getUsuario();
        this.contrasena = u.getContrasena();
        this.administrador = u.isAdministrador();
    }

    public String getUsuario() {
        return usuario;
    }
    
    public String getContrasena() {
        return contrasena;
    }

    public boolean isAdministrador() {
        return administrador;
    }
}
