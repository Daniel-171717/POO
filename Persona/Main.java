package Persona;

public class Main {
    public static void main(String[] args) {
        Padre Objeto1 = new Padre();
        Hijo Objeto2 = new Hijo();

        Objeto1.SetNombre("Leo");
        Objeto1.SetEdad(42);
        Objeto1.SetProfecion("Albañil");
        Objeto1.SetAltura(1.70);
        System.out.println("\t\tInformacion del padre");
        System.out.println("El Nombre  es: "+Objeto1.GetNombre());
        System.out.println("La Edad es: "+Objeto1.GetEdad());
        System.out.println("La Altura es: "+Objeto1.GetAltura());
        System.out.println("La Profecion es: "+Objeto1.GetProfecion());


        Objeto2.SetNombreHijo("Isaac");
        Objeto2.SetEdadHijo(19);
        Objeto2.SetProfecionHijo("Estudiante");
        Objeto2.SetAlturaHijo(1.68);
        System.out.println("\t\tInformacion Hijo");
        System.out.println("El Nombre es: "+Objeto2.GetNombreHijo());
        System.out.println("La Edad es: "+Objeto2.GetEdadHijo());
        System.out.println("La Altura es: "+Objeto2.GetAlturaHijo());
        System.out.println("La Profecion es: "+Objeto2.GetProfecionHijo());
    }
}
