
package Controller;

import Model.Citas;
import Model.Paciente;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PacienteController {
    
    public ArrayList<Paciente> listaPaciente;
    
    private static PacienteController instancia;

    private PacienteController() {
        listaPaciente = new ArrayList<>();
    }
    
    public static PacienteController getInstancia()
    {
        if(instancia == null)
        {
            instancia = new PacienteController();
        }
        return instancia;
    }
    
    public Paciente GuardarPaciente(String Cedula, String Nombre, int Edad, boolean sexo)
    {
        Paciente paciente = new Paciente(Cedula, Nombre, Edad, sexo);
        listaPaciente.add(paciente);
        return paciente;
    }
    
    public ArrayList<Paciente> ListadoPaciente()
    {
        return listaPaciente;
    }
    
    public ArrayList<Paciente> ListadoPacientePorCedula(String cedula)
    {
        ArrayList<Paciente> nuevolistado = new ArrayList<>();
        
        for (Paciente paciente : listaPaciente) {
            if(paciente.getCedula().contains(cedula))
            {
                nuevolistado.add(paciente);
            }
        }
        return nuevolistado;
    }
    
    public ArrayList<Paciente> ListadoPacientePorNombre(String nombre)
    {
        ArrayList<Paciente> nuevolistado = new ArrayList<>();
        
        for (Paciente paciente : listaPaciente) {
            if(paciente.getNombre().contains(nombre))
            {
                nuevolistado.add(paciente);
            }
        }
        return nuevolistado;
    }
    
    public ArrayList<Paciente> EliminarPacientePorCedula(String cedula)
    {
        ArrayList<Paciente> nuevaCita = new ArrayList<>();
        for (Paciente paciente : listaPaciente) {
            if(paciente.getCedula().contains(cedula))
            {
                /*if(listaCita.getPaciente().getCedula().contains(cedula))
                {
                    listaCitas.remove(listaCita);
                    JOptionPane.showMessageDialog(null,"SE HA ELIMINADO LA CITA DEL PACIENTE: "+listaCita.getPaciente().getNombre()+" BUSQUE LA CITA EN EL REGISTRO POR SU CEDULA");
                }*/
                listaPaciente.remove(paciente);
                JOptionPane.showMessageDialog(null,"SE HA ELIMINADO EL PACIENTE: "+paciente.getNombre());
            }
            else
            {
                nuevaCita.add(paciente);
            }
        }
        
        return nuevaCita;
    }
}
