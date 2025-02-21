
package Model;

public class Buzon {
    private String destinatario;
    private String remitente;
    private String carta;

    public Buzon(String destinatario, String remitente, String carta) {
        this.destinatario = destinatario;
        this.remitente = remitente;
        this.carta = carta;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getCarta() {
        return carta;
    }

    public void setCarta(String carta) {
        this.carta = carta;
    }
    
    public String getCartaMensaje()
    {
        return "DE: "+remitente+"\nPARA: "+destinatario+"\nMENSAJE: "+carta;
    }
    
}
