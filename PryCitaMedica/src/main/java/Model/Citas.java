
package Model;

public class Citas {
    private Paciente paciente;
    private Medico medico;
    private String fecha;
    private String hora;
    private String obserbaciones;
    private Especialidad especialidad;

    public Citas(Paciente paciente, Medico medico, Especialidad especialidad ,String fecha, String hora, String obserbaciones) {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
        this.hora = hora;
        this.obserbaciones = obserbaciones;
        this.especialidad = especialidad;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getObserbaciones() {
        return obserbaciones;
    }

    public void setObserbaciones(String obserbaciones) {
        this.obserbaciones = obserbaciones;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
    
}
