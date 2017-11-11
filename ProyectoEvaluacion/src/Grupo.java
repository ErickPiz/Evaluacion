/**
 * 
 * @author Piz
 */
public class Grupo {
    String nombre;
    Rubro rubro[];
    Alumno alumno[];

    public String getNombre() {
        return nombre;
    }

    public Rubro getRubro(int index) {
        return rubro[index];
    }

    public Alumno getAlumno(int index) {
        return alumno[index];
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRubro(Rubro rubro, int index) {
        this.rubro[index] = rubro;
    }

    public void setAlumno(Alumno alumno,int index) {
        this.alumno[index] = alumno;
    }
    
    
    
    
    
}
