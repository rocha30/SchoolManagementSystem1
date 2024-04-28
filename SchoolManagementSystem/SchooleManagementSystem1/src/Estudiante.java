import java.util.Date;

public class Estudiante extends Persona {
    private int id;
    private String nombre;
    private String apellido;
    private int Fecha_Nacimiento;
    private String estado; //matriculado, inactivo, graduado

    public  Estudiante (int id, String nombre, String apellido, int Fecha_Nacimiento, String estado){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = estado;
        this.Fecha_Nacimiento = Fecha_Nacimiento;

    }



}
