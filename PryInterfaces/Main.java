package PryInterfaces;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro();
        Gato gato = new Gato();
        perro.HacerSonido();
        perro.Amamantar();
        gato.HacerSonido();
        gato.Amamantar();
    }
}
