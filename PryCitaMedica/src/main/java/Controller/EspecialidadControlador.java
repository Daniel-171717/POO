
package Controller;

import Model.Especialidad;
import Model.Medico;
import java.util.ArrayList;

public class EspecialidadControlador {
    ArrayList<Especialidad> especialidadLista;
    private static EspecialidadControlador instancia;

    private EspecialidadControlador() {
        especialidadLista = new ArrayList<>();
    }
    
    public static EspecialidadControlador getinstancia()
    {
        if(instancia == null)
        {
            instancia = new EspecialidadControlador();
        }
        return instancia;
    }
    
    public Especialidad GuardarEspecialidad(String especialidad)
    {
        Especialidad especialidad1 = new Especialidad(especialidad);
        especialidadLista.add(especialidad1);
        return especialidad1;
    }
    
    public ArrayList<Especialidad> listaEspecialidad()
    {
        return especialidadLista;
    }
    
    public ArrayList<Especialidad> ListadoEspecialidadPorNombre(String nombre)
    {
        ArrayList<Especialidad> nuevolistado = new ArrayList<>();
        
        for (Especialidad especialidad1: especialidadLista) {
            if(especialidad1.getEspecialidad().contains(nombre))
            {
                nuevolistado.add(especialidad1);
            }
        }
        return nuevolistado;
    }
}
