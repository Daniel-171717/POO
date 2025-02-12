
package Model;

public class CandidatoModel {
    private String NombreApellido;
    private String Partido;

    public CandidatoModel(String NombreApellido, String Partido) {
        this.NombreApellido = NombreApellido;
        this.Partido = Partido;
    }

    public String getNombreApellido() {
        return NombreApellido;
    }

    public void setNombreApellido(String NombreApellido) {
        this.NombreApellido = NombreApellido;
    }

    public String getPartido() {
        return Partido;
    }

    public void setPartido(String Partido) {
        this.Partido = Partido;
    }
    
}
