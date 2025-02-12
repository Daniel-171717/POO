
package Model;

public class CiudadanoModel {
    private String nombreApellido;
    private int Cedula;

    public CiudadanoModel() {
    }

    public CiudadanoModel(String nombreApellido, int Cedula) {
        this.nombreApellido = nombreApellido;
        this.Cedula = Cedula;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }
    
}
