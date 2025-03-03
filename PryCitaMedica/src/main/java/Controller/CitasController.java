
package Controller;

import Model.Citas;
import Model.Especialidad;
import Model.Medico;
import Model.Paciente;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;
import javax.swing.JOptionPane;

public class CitasController {
    
    public ArrayList<Citas> listaCitas;
    public Paciente paciente;
    public Medico medico;
    private static CitasController instancia;

    private CitasController() {
        listaCitas = new ArrayList<>();
    }
    
    public static CitasController getinstancia()
    {
        if(instancia == null)
        {
            instancia = new CitasController();
        }
        return instancia;
    }
    
    public Citas GuardarCitas(Paciente paciente, Medico medico, Especialidad especialidad ,String fecha, String hora,String observacion)
    {
        Citas cita = new Citas(paciente, medico, especialidad ,fecha, hora,observacion);
        listaCitas.add(cita);
        return cita;
    }
    
    public ArrayList<Citas> ListaTurnos()
    {
        return listaCitas;
    }
    
    public ArrayList<Citas> ListadoTurnoPorCedula(String cedula)
    {
        ArrayList<Citas> nuevolistado = new ArrayList<>();
        
        for (Citas cita : listaCitas) {
            if(cita.getPaciente().getCedula().contains(cedula))
            {
                nuevolistado.add(cita);
            }
        }
        return nuevolistado;
    }
    
    public ArrayList<Citas> EliminarCitaPorCedula(String cedula)
    {
        ArrayList<Citas> nuevaCita = new ArrayList<>();
        for (Citas listaCita1 : listaCitas) {
            if(listaCita1.getPaciente().getCedula().contains(cedula))
            {
                /*if(listaCita.getPaciente().getCedula().contains(cedula))
                {
                    listaCitas.remove(listaCita);
                    JOptionPane.showMessageDialog(null,"SE HA ELIMINADO LA CITA DEL PACIENTE: "+listaCita.getPaciente().getNombre()+" BUSQUE LA CITA EN EL REGISTRO POR SU CEDULA");
                }*/
                listaCitas.remove(listaCita1);
                JOptionPane.showMessageDialog(null,"SE HA ELIMINADO LA CITA DEL PACIENTE: "+listaCita1.getPaciente().getNombre());
            }
            else
            {
                nuevaCita.add(listaCita1);
            }
        }
        
        return nuevaCita;
    }
    
    public ArrayList<Citas> ListadoTurnoPorEspecialidad(String especialidad)
    {
        ArrayList<Citas> nuevolistado = new ArrayList<>();
        
        for (Citas cita : listaCitas) {
            if(cita.getMedico().getEspecialidad().getEspecialidad().contains(especialidad))
            {
                nuevolistado.add(cita);
            }
        }
        return nuevolistado;
    }
    
    public ArrayList<Citas> ListadoTurnoPorMedico(String medico)
    {
        ArrayList<Citas> nuevolistado = new ArrayList<>();
        
        for (Citas cita : listaCitas) {
            if(cita.getMedico().getNombre().contains(medico))
            {
                nuevolistado.add(cita);
            }
        }
        return nuevolistado;
    }
    
    public ArrayList<Citas> ListadoTurnoPorFecha(String fecha)
    {
        ArrayList<Citas> nuevolistado = new ArrayList<>();
        
        for (Citas cita : listaCitas) {
            if(cita.getFecha().contains(fecha))
            {
                nuevolistado.add(cita);
            }
        }
        return nuevolistado;
    }
}
