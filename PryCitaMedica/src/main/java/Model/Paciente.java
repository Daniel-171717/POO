
package Model;

public class Paciente {
    private String Cedula;
    private String Nombre;
    private int Edad;
    private boolean sexo;

    public Paciente(String Cedula, String Nombre, int Edad, boolean sexo) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.sexo = sexo;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
    
    public String getSexo()
    {
        return sexo ? "Hombre" : "Mujer";
    }
}
