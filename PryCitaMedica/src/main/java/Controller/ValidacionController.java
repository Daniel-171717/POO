
package Controller;

import Model.Especialidad;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ValidacionController {
    
    private static ValidacionController instancia;
    private EspecialidadControlador especialidad1 = EspecialidadControlador.getinstancia();
    String Nombre;
    String Cedula;
    int Edad;
    boolean Sexo;

    public ValidacionController() {
    }
    
    public static ValidacionController getinstancia()
    {
        if(instancia == null)
        {
            instancia = new ValidacionController();
        }
        return instancia;
    }
    
    public String ValidacionNombre(String nombre)
    {
        if(nombre.matches("[a-zA-Z]+( [a-zA-Z]+)?"))
        {
            return nombre;
        }
        else if(nombre.isEmpty() || nombre.matches("\\d{1,10}"))
        {
            JOptionPane.showMessageDialog(null, "EL NOMBRE INGRESADO ES INVALIDO");
        }
        return null;
    }
    
    public String ValidacionCedula(String cedula)
    {
        if(cedula.matches("\\d{1,10}"))
        {
            return cedula;
        }
        else if(cedula.isEmpty() || cedula.matches("[a-zA-Z]+"))
        {
            JOptionPane.showMessageDialog(null, "LA CEDULA INGRESADA ES INCORRECTA");
        }
        return null;
    }
    
    public int ValidacionEdad(String edad)
    {
        if(edad.matches("\\d{1,3}"))
        {
            Edad = Integer.parseInt(edad);
        }
        else if(edad.matches("[a-zA-Z]+( [a-zA-Z]+)?") || edad.isEmpty() || (Integer.parseInt(edad)>110 || Integer.parseInt(edad)<0))
        {
            JOptionPane.showMessageDialog(null, "LA EDAD INGRESADA ES INCORRECTA");
        }
        return Edad;
    }
    
    public boolean ValidacionSexo(String sexo)
    {
        if(sexo.equalsIgnoreCase("Hombre"))
        {
            Sexo = true;
        }
        else
        {
            Sexo = false;
        }
        return Sexo;
    }
    
    public String ValidarEspecialidad(String especialidad)
    {
        if(especialidad.matches("[a-zA-Z]+( [a-zA-Z]+)?"))
        {
            return especialidad;
        }
        else if(especialidad.isEmpty() || especialidad.matches("\\d{1,10}"))
        {
            JOptionPane.showMessageDialog(null, "LA ESPECIALIDAD INGRESADA ES INVALIDO");
        }
        return null;
    }
    
    public String ValidarEspecialidadPorNombre(String especialidad)
    {
        for (Especialidad especialidad2 : especialidad1.listaEspecialidad()) {
            if(especialidad2.getEspecialidad().equalsIgnoreCase(especialidad))
            {
                return especialidad;
            }
        }
        return null;
    }
    
    public boolean VerificadorDeIngresoDeDatos(String Nombre, String cedula, int edad)
    {
        if(Nombre.isEmpty() || cedula.isEmpty() || (edad>110 || edad<=0))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    //Metodo para validar el ingreso de la Fecha
    public boolean ValidacionFecha(String fecha)
    {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            // Convertir la cadena a LocalDate y validar si es una fecha real
            LocalDate.parse(fecha, formato);
            return true; // Si no hay error, la fecha es válida
        } catch (DateTimeParseException e) {
            return false; // Si hay error, la fecha es inválida
        }
    }
    
    //Metodo para validar el ingreso de la Hora
    public boolean ValidacionHora(String hora)
    {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("H:mm");
        try {
            // Convertir la cadena a LocalTime y validar si es una hora real
            LocalTime.parse(hora, formato);
            return true; // Si no hay error, la hora es válida
        } catch (DateTimeParseException e) {
            return false; // Si hay error, la hora es inválida
        }
    }
    
    //Metodo para validar la entrada de datos de la Fecha
    public boolean ValidacionIngresoFechaHora(String fecha, String hora, String obserbacion)
    {
        if(fecha.isEmpty() || hora.isEmpty() || obserbacion.isEmpty())
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
