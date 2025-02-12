
package Model;

import View.VistaView;
import java.util.ArrayList;

public class RegistroModel {
    ArrayList<Integer> voto = new ArrayList<>();
    ArrayList<CiudadanoModel> ciudadano = new ArrayList<>();
    
    public void RegistroVotos(int a)
    {
        voto.add(a);
    }
    
    public void RegistroCiudadano(CiudadanoModel ciudadano1)
    {
        ciudadano.add(ciudadano1);
    }
    
    public double Porcentaje ()
    {
        double porcentaje = voto.size();
        return porcentaje;
    }
    
    
}
