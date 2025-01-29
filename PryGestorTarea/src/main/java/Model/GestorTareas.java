
package Model;

import java.util.ArrayList;

public class GestorTareas {
    private ArrayList<Tarea> tareas = new ArrayList<Tarea>();

    public void agregarTarea(Tarea nuevaTarea) {
        tareas.add(nuevaTarea);
    }

    public ArrayList<Tarea> listarTareas() {
        return tareas;
    }
    
    public int Dimencion()
    {
        return tareas.size();
    }
    
    public boolean Actualizar (String nombre, boolean estado){
        for (Tarea tarea : tareas) {
            if(tarea.getNombre() == nombre)
            {
                tarea.setCompletada(estado);
            }
        }
        Tarea tarea = new Tarea();
        return tarea.getCompletada();
    }

    public int eliminarTarea(String nombre) {
        Tarea tarea = new Tarea();
        for (int i = 0; i < tareas.size(); i++) {
            //Object object = arr[i];
            if(tareas.get(i).getNombre() == nombre)
            {
                return i;
            }
        }
        return 0;
    }
}
