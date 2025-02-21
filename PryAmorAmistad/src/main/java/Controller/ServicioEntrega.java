
package Controller;

import Model.Buzon;
import java.util.ArrayList;

public class ServicioEntrega {
    private static ServicioEntrega instancia;
    private ArrayList<Buzon> buzon;

    private ServicioEntrega() {
        buzon = new ArrayList<>();
    }
    
    public static ServicioEntrega getinstancia()
    {
        if(instancia == null)
        {
            instancia = new ServicioEntrega();
        }
        return instancia;
    }
    
    public void AgregarCarta(String remitente, String destinario, String carta)
    {
        buzon.add(new Buzon(destinario, remitente, carta));
    }
    
    public ArrayList<Buzon> Lista()
    {
        return  buzon;
    }
}
