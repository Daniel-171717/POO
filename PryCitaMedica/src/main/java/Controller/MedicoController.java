
package Controller;

import Model.Citas;
import Model.Especialidad;
import Model.Medico;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MedicoController {
    
    public ArrayList<Medico> listaMedico;
    private static MedicoController instancia;

    private MedicoController() {
        listaMedico = new ArrayList<>();
    }
    
    public static MedicoController getinstancia()
    {
        if(instancia == null)
        {
            instancia = new MedicoController();
        }
        return instancia;
    }
    
    public Medico GuardarMedico(String especialidad, String cedula, String nombre, int edad, boolean sexo)
    {
        Medico medico = new Medico(new Especialidad (especialidad), cedula, nombre, edad, sexo);
        listaMedico.add(medico);
        return medico;
    }
    
    public ArrayList<Medico> ListaMedico()
    {
        return listaMedico;
    }
    
    public ArrayList<Medico> ListadoMedicoPorCedula(String cedula)
    {
        ArrayList<Medico> nuevolistado = new ArrayList<>();
        
        for (Medico medico : listaMedico) {
            if(medico.getCedula().contains(cedula))
            {
                nuevolistado.add(medico);
            }
        }
        return nuevolistado;
    }
    
    public ArrayList<Medico> MedicosSegunProfesion(String especialidad)
    {
        ArrayList<Medico> listaMedicoEspecialidad = new ArrayList<>();
        for (Medico medico1 : listaMedico) {
            if(medico1.getEspecialidad().getEspecialidad().contains(especialidad))
            {
                listaMedicoEspecialidad.add(medico1);
            }
        }
        
        return listaMedicoEspecialidad;
    }
    
    public ArrayList<Medico> ListadoMedicoPorNombre(String nombre)
    {
        ArrayList<Medico> nuevolistado = new ArrayList<>();
        
        for (Medico medico : listaMedico) {
            if(medico.getNombre().contains(nombre))
            {
                nuevolistado.add(medico);
            }
        }
        return nuevolistado;
    }
    
    public ArrayList<Medico> EliminarMedicoPorCedula(String cedula)
    {
        ArrayList<Medico> nuevolistado = new ArrayList<>();
        
        for (Medico medico : listaMedico) {
            if(medico.getCedula().contains(cedula))
            {
                listaMedico.remove(medico);
                JOptionPane.showMessageDialog(null,"SE HA ELIMINADO AL MEDICO: "+medico.getNombre());
            }
            else
            {
                nuevolistado.add(medico);
            }
        }
        return nuevolistado;
    }
}
