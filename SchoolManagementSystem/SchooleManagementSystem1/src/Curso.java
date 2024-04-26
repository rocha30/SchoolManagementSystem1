public class Curso {
    private int id;
    private String nombre;
    private String descripción;
    private int numCreditos;
    private double version;

    public  Curso (int id, String nombre, String descripción, int numCreditos, double version){
        this.id = id;
        this.nombre = nombre;
        this.descripción = descripción;
        this.numCreditos = numCreditos;
        this.version = version;
    }
}
