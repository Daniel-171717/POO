package ExamenP1S2;
import ExamenP1S2.Operaciones;
public class Figuras {
    public static void main(String[] args) {
        Operaciones operacion= new Operaciones(5, 12);
        System.out.println("El area del triangulo es: "+operacion.GetTriangulo());
        System.out.println("El area del rectangulo es: "+operacion.GetRectangulo());
    }
}
