
package Model;

public class Medico extends Paciente{
    
    private Especialidad especialidad;

    public Medico(Especialidad especialidad, String Cedula, String Nombre, int Edad, boolean sexo) {
        super(Cedula, Nombre, Edad, sexo);
        this.especialidad = especialidad;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
    
}
